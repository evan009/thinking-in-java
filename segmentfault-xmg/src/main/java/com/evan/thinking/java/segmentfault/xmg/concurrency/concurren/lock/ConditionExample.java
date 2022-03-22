package com.evan.thinking.java.segmentfault.xmg.concurrency.concurren.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Desc: TODO
 * @author: liuawei
 * @date: 2021-05-09 15:41
 */
public class ConditionExample {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
         Condition condition =  lock.newCondition();
    }

}
