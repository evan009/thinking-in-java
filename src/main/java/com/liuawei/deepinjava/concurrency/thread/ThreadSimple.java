package com.liuawei.deepinjava.concurrency.thread;

/**
 * @Desc: TODO
 * @author: liuawei
 * @date: 2021-05-05 14:39
 */
public class ThreadSimple {

    public static void main(String[] args) {

        Thread t1 = new Thread1();

        Thread2 thread2 = new Thread2();
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();

    }

}

class Thread1 extends Thread {

    @Override
    public void run() {
        System.out.println("通过继承Thread类实现线程");
    }

}

class Thread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("通过继承Runnable接口实现线程");
    }
}