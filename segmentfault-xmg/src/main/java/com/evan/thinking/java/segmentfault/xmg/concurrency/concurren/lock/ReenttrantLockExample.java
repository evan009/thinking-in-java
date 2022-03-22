package com.evan.thinking.java.segmentfault.xmg.concurrency.concurren.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Desc: TODO
 * @author: liuawei
 * @date: 2021-05-09 15:41
 */
public class ReenttrantLockExample {


    public static void main(String[] args) {

        /**
         * try lock
         */

    }

    public static void bestPractice(){
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            // do somethind
        } finally {
            lock.unlock();
        }
    }
}
