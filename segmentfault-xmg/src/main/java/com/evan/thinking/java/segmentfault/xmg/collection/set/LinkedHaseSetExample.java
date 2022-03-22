package com.evan.thinking.java.segmentfault.xmg.collection.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

/**
 * @Desc: TODO
 * @author: evan
 * @date: 2021-11-30
 */
public class LinkedHaseSetExample {

    public static void main(String[] args) {
        LinkedHashSet<String> result = new LinkedHashSet<>();
        result.add(null);
        result.add("str1");
        result.add("str1");
        result.add("str2");
        result.add("str3");
        result.stream().collect(Collectors.toSet());
        // 第一种方式遍历
        result.forEach(str -> System.out.println(str));
        // 第二种方式遍历
        for (String str : result) {
            System.out.println(str);
        }
        result.removeAll(Collections.singleton(null));
        // 第三种方式遍历
        Iterator<String> iterator = result.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        // 第四种方式遍历
        String[] strArrResult = new String[result.size()];
        result.toArray(strArrResult);
        for (int i = 0; i < strArrResult.length; i++) {
            System.out.println(strArrResult[i]);
        }

    }

}
