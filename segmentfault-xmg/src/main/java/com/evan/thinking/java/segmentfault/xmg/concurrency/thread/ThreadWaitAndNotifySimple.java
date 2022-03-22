package com.evan.thinking.java.segmentfault.xmg.concurrency.thread;

/**
 * @Desc: 线程等待和通知
 * @author: liuawei
 * @date: 2021-05-05 17:48
 */
public class ThreadWaitAndNotifySimple {

    public static void main(String[] args) throws InterruptedException {

        Thread threadA = new Thread(ThreadWaitAndNotifySimple::printDemo);
        threadA.setName("Thread-A");
        threadA.start();

        Thread threadB = new Thread(ThreadWaitAndNotifySimple::printDemo);
        threadB.setName("Thread-B");
        threadB.start();
        /**
         * Object.wait() 与 Thread.join() 一样
         * 调用 wait() 方法的对象，和调用 notify() 方法必须是同一对象
         */
        Object monitor = ThreadWaitAndNotifySimple.class;
        synchronized (monitor) {
            monitor.notifyAll();
        }
    }

    private static void printDemo() {
        Thread currentThread = Thread.currentThread();
        Object monitor = ThreadWaitAndNotifySimple.class;
        synchronized (monitor) {
            try {
                System.out.printf("等待 线程:%s  state:%s \n", currentThread.getName(), currentThread.getState());
                monitor.wait();
                System.out.printf("等待 线程:%s  state:%s \n", currentThread.getName(), currentThread.getState());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("唤醒  线程:%s  state:%s \n", currentThread.getName(), currentThread.getState());
        }
    }
}
