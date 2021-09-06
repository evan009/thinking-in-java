package com.evan.deepinjava.concurrency.thread;

/**
 * @Desc: TODO
 * @author: liuawei
 * @date: 2021-05-05 16:53
 */
public class ThreadDump {

    public static void main(String[] args) {
        Thread.dumpStack();

        new Throwable("Stack trace").printStackTrace(System.out);
    }
}
