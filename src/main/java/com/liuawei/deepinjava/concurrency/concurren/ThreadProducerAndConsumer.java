package com.liuawei.deepinjava.concurrency.concurren;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Desc: TODO
 * @author: liuawei
 * @date: 2021-05-05 23:05
 */
public class ThreadProducerAndConsumer {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Container container = new Container();
        executorService.submit(() -> {
            container.producer();
        });
        executorService.submit(() -> {
            container.consumer();
        });

        Thread.sleep(1000);
        executorService.shutdown();

    }

}

class Container {

    private static final int MAX_SIZE = 5;
    private List<Integer> data = new LinkedList<>();
    private Random random = new Random();

    public void producer() {
        while (true) {
            try {
                synchronized (this) {
                    while (data.size() >= MAX_SIZE) {
                        wait();
                    }
                    int value = random.nextInt(100);
                    data.add(value);
                    System.out.printf("线程[%s] 生产数据%s    \n", Thread.currentThread().getId(), value);

                    // 唤醒消费者消费数据
                    Thread.sleep(200);
                    notify();

                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void consumer() {
        while (true) {
            try {
                synchronized (this) {
                    while (data.isEmpty()) {
                        wait();
                    }
                    int value = data.remove(0);
                    System.out.printf("线程[%s] 消费数据%s    \n", Thread.currentThread().getId(), value);

                    // 唤醒生产者生产数据
                    notify();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}
