package com.evan.thinking.java.segmentfault.xmg.algorithm.hash;

import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.commons.codec.digest.MurmurHash3;
import org.apache.commons.lang3.StringUtils;

/**
 * @Desc: 一致性Hash
 * @author: liuawei
 * @date: 2021-08-17 16:57
 * @see https://www.jianshu.com/p/528ce5cd7e8f
 */
public class ConsistentHash<T> {

    /**
     * 节点的副本
     */
    private Integer nodeReplicas;

    private SortedMap<Integer, T> virtualCircle = new TreeMap<>();

    public ConsistentHash(Integer nodeReplicas, Collection<T> nodes) {
        this.nodeReplicas = nodeReplicas;
        for (T node : nodes) {
            addNode(node);
        }
    }

    public void addNode(T node) {
        for (int i = 0; i < nodeReplicas; i++) {
            virtualCircle.put(MurmurHash3.hash32(node.toString() + i), node);
        }
    }

    public void removeNode(T node) {
        for (int i = 0; i < nodeReplicas; i++) {
            virtualCircle.remove(MurmurHash3.hash32(node.toString() + i), node);
        }
    }

    public T getKey(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        int hashKey = MurmurHash3.hash32(key);

        if (!virtualCircle.containsKey(hashKey)) {
            SortedMap<Integer, T> tailMap = virtualCircle.tailMap(hashKey);
            hashKey = tailMap.isEmpty() ? virtualCircle.firstKey() : tailMap.firstKey();
        }
        return virtualCircle.get(hashKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, T> entry : virtualCircle.entrySet()) {
            sb.append(entry + "\n");
        }
        return sb.toString();
    }
}