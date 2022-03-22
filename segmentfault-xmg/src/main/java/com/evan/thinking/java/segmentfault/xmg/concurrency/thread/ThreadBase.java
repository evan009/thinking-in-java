package com.evan.thinking.java.segmentfault.xmg.concurrency.thread;

/**
 * @Desc: TODO
 * @author: liuawei
 * @date: 2021-05-05 16:17
 */
public class ThreadBase {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(ThreadBase::sayHello);
        thread.start();
        thread.join();
        System.out.println("thread stats  " + thread.getState());
        System.out.printf("main thread name %s stats %s  ", Thread.currentThread().getName(),
            Thread.currentThread().getState());

    }

    private static void sayHello() {
        Thread thread = Thread.currentThread();
        System.out.println("current thread id: " + thread.getId());
        System.out.println("current thread name: " + thread.getName());
        System.out.println("current thread thread Group: " + thread.getThreadGroup());
    }
}
