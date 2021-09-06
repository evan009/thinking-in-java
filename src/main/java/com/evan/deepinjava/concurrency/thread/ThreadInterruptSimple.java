package com.evan.deepinjava.concurrency.thread;

/**
 * @Desc: 线程中断示例
 * @author: liuawei
 * @date: 2021-05-05 17:14
 */
public class ThreadInterruptSimple {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(ThreadInterruptSimple::printDemo);
        thread.start();
        // interrupt不能中断线程，只能传递interrupt状态
        thread.interrupt();
        thread.join();
    }

    private static void printDemo() {
        Thread currentThread = Thread.currentThread();
        try {
            /**
             * 会清除中断标记
             */
            currentThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (currentThread.isInterrupted()){
            System.out.printf("线程id:%d 我被中断了 state:%s \n",currentThread.getId(),currentThread.isInterrupted());
            return;
        }
        System.out.printf("线程id:%d  state:%s \n",currentThread.getId(),currentThread.getState());
    }

}
