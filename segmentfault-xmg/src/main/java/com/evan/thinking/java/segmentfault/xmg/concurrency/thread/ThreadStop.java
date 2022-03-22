package com.evan.thinking.java.segmentfault.xmg.concurrency.thread;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @Desc: TODO
 * @author: liuawei
 * @date: 2021-05-05 17:01
 */
public class ThreadStop {
    public static void main(String[] args) throws InterruptedException {

        StoppableAction stoppableAction = new StoppableAction();
        Thread thread = new Thread(stoppableAction);
        thread.start();
        stoppableAction.stop();
        Thread.sleep(5000);
        thread.join();
    }

    private static class StoppableAction implements Runnable {

        /**
         * @see AtomicBoolean
         */
        private volatile boolean stopped;

        @Override
        public void run() {
            if (stopped){
                System.out.println("StoppableAction return");
                return;
            }else {
                System.out.println("StoppableAction working");
            }
        }

        public void stop(){
            this.stopped = true;
        }
    }

}
