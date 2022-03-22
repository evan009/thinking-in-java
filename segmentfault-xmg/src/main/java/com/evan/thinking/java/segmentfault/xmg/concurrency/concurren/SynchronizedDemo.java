package com.evan.thinking.java.segmentfault.xmg.concurrency.concurren;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Desc: TODO
 * @author: liuawei
 * @date: 2021-05-05 19:26
 */
public class SynchronizedDemo {

    public static void main(String[] args) {

        // Counter counter = new Counter();
        // for (int i = 0; i < 1000; i++) {
        // counter.increment();
        // }
        // System.out.println(counter);
        //
        //
        // Counter counter2 = new Counter();
        // for (int i = 0; i < 1000; i++) {
        // executorService.submit(()->{counter2.increment();});
        // }
        // System.out.println(counter2);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CounterSynchronized counterSynchronized = new CounterSynchronized();
        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                counterSynchronized.increment();
            });
        }
        executorService.shutdown();
        System.out.println(counterSynchronized.toString());

    }

}

class Counter {

    private int date;

    public void increment() {
        date++;
    }

    @Override
    public String toString() {
        return "Counter{" + "date=" + date + '}';
    }
}

class CounterSynchronized {

    private volatile int date = 0;

    public synchronized void increment() {
        date = date + 1;
    }

    @Override
    public String toString() {
        return "Counter{" + "date=" + date + '}';
    }
}
