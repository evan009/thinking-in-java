package com.evan.thinking.java.segmentfault.xmg.concurrency.concurren;

import java.util.concurrent.locks.LockSupport;

/**
 * @Desc: 死锁展示
 * @author: liuawei
 * @date: 2021-05-05 22:25
 */
public class DeadLockSimple {

    private static Thread threadA;

    private static Thread threadB;

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(() -> {
            LockSupport.park(threadB);
            System.out.println("workA");
        }, "workA");
        threadA.start();

        Thread threadB = new Thread(() -> {
            LockSupport.park(threadA);
            System.out.println("workB");
        }, "workB");
        threadB.start();



        System.out.println("dead Lock");
    }

}
