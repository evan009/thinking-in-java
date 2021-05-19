package com.liuawei.deepinjava.concurrency.thread;

/**
 * @Desc: 概念
 * @author: liuawei
 * @date: 2021-05-05 10:18
 */
public class ConceptSimple {

    public static void main(String[] args) {
        /**
         * 概念
         * 进程：(程序或者应用程序的)同义词
         * A process has a self-contained execution environment. A process generally has a complete, private set of basic run-time resources; in particular, each process has its own memory space.
         * 进程具有自包含的执行环境。一个进程通常有一个完整的私有的基本运行时资源集; 特别是，每个进程都有自己的内存空间。
         * Java 应用程序可以使用 ProcessBuilder 对象创建其他进程。多进程应用程序超出了本课的范围。
         *
         * 线程：
         * Threads are sometimes called lightweight processes. Both processes and threads provide an execution environment, but creating a new thread requires fewer resources than creating a new process.
         * 线程有时被称为轻量级进程。进程和线程都提供了一个执行环境，但是创建一个新线程比创建一个新进程需要更少的资源。
         * Threads exist within a process — every process has at least one. Threads share the process's resources, including memory and open files. This makes for efficient, but potentially problematic, communication.
         * 线程存在于一个进程中ーー每个进程至少有一个线程。线程共享进程的资源，包括内存和打开的文件。这使得沟通更有效率，但是潜在的问题。
         */


        /**
         * 学习ProcessBuilder
         *
         * 执行本地计算程序
         *
         * ThreadMxBean
         *
         * Dump
         *
         * jstack
         *
         * POSIX 线程
         *
         * 线程打印
         * 线程循环打印参数
         *
         * 线程终止
         *
         * 获取进程相关信息
         *
         * 管理子进程
         *
         */


        /**
         * Java 线程
         *
         * Java 1.2
         * Green Thread
         *
         * Native Os Thread
         * 基于OS线程 数量映射为1:1
         *
         * 线程编程模型
         * Thread Rnnable
         * 5 Executor Future Callbale
         * 7 ForkJoin
         * 8 CompletionStage  CompletableFuture
         * 9 FLOW（Publisher、 Subscriber、 Subscription、 Processor）
         *
         * 线程池编程模型
         * 自定义Thread Pool
         * 5 ExecutorService
         *      ThreadPoolExecutor
         *      ScheduledThreadPoolExecutor
         * 7 ForkJoinPool
         *
         * 并发框架
         * 5 JUC
         * 7 Fork/Join
         * 8 CompletableFuture RxJava Reactor
         * 9 FlowAPI Reactive Streams
         *
         * @see  http://sourceware.org/pthreads-win32/
         *
         * 同步
         *
         * 异步
         *
         * 非阻塞
         *
         */

        /**
         * 线程状态
         * @see Thread.State
         */
    }
}
