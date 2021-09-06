package com.evan.deepinjava.concurrency.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/**
 * @Desc: TODO
 * @author: liuawei
 * @date: 2021-05-05 18:10
 */
public class ThreadAlternatePrint {

    private static Thread threadA, threadB;

    public static void main(String[] args) {

        char[] charArrLetter = "ABCDEF".toCharArray();
        char[] charArrNumber = "123456".toCharArray();
//        whileAndAtomic(charArrLetter, charArrNumber);
        lockSupport(charArrNumber,charArrLetter);

    }

    public static void whileAndAtomic(char[] letterArr, char[] numberArr) {

        AtomicInteger flag = new AtomicInteger(1);
        flag.set(1);

        new Thread(() -> {
            for (char c : letterArr) {
                while (flag.get() != 1) {
                    // 啥都不处理
                }
                System.out.printf("whileAndAtomic name:%s,value:%s  \n", Thread.currentThread().getName(), c);
                flag.set(0);
            }
        }, "work1").start();
        new Thread(() -> {
            for (char c : numberArr) {
                while (flag.get() != 0) {
                    // 啥都不处理
                }
                System.out.printf("whileAndAtomic name:%s,value:%s \n", Thread.currentThread().getName(), c);
                flag.set(1);
            }
        }, "work2").start();

    }

    public static void lockSupport(char[] letterArr, char[] numberArr) {

        threadA = new Thread(() -> {
            for (char c : letterArr) {
                LockSupport.unpark(threadB);
                System.out.printf("lockSupport name:%s,value:%s  \n", Thread.currentThread().getName(), c);
                LockSupport.park(threadA);
            }
        }, "work1");
        threadB = new Thread(() -> {
            for (char c : numberArr) {
                LockSupport.park(threadB);
                System.out.printf("lockSupport name:%s,value:%s \n", Thread.currentThread().getName(), c);
                LockSupport.unpark(threadA);
            }
        }, "work2");

        threadA.start();
        threadB.start();

    }

}
