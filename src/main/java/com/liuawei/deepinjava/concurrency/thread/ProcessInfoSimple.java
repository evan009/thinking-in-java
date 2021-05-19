package com.liuawei.deepinjava.concurrency.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadMXBean;

/**
 * @Desc: 进程信息示例
 * @author: liuawei
 * @date: 2021-05-05 17:32
 */
public class ProcessInfoSimple {

    public static void main(String[] args) {

        ManagementFactory.getMemoryManagerMXBeans().forEach((memoryManagerMXBean) -> {
            System.out.println(memoryManagerMXBean);
        });

        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        for (long threadId : threadMXBean.getAllThreadIds()) {
            System.out.println(threadMXBean.getThreadInfo(threadId));
        }
        runtimeMxBean();

    }

    private static void runtimeMxBean() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        System.out.println("runtime name:" + runtimeMXBean.getName());
        System.out.println("runtime specName:" + runtimeMXBean.getSpecName());
        System.out.println("runtime specVendor:" + runtimeMXBean.getSpecVendor());
        System.out.println("runtime specVersion:" + runtimeMXBean.getSpecVersion());
        System.out.println("runtime vnName:" + runtimeMXBean.getVmName());
        System.out.println("runtime vmVendor:" + runtimeMXBean.getVmVendor());
        System.out.println("runtime vmVersion:" + runtimeMXBean.getVmVersion());
        System.out.println("runtime bootClassPath:" + runtimeMXBean.getBootClassPath());
        System.out.println("runtime libraryPath:" + runtimeMXBean.getLibraryPath());
        System.out.println("runtime startTime:" + runtimeMXBean.getStartTime());
        System.out.println("runtime upTime:" + runtimeMXBean.getUptime());
        System.out.println("runtime systemProperties:" + runtimeMXBean.getSystemProperties());
    }

}
