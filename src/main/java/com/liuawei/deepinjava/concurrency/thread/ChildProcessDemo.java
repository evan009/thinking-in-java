package com.liuawei.deepinjava.concurrency.thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Desc: 通过Java执行子进程
 * @author: liuawei
 * @date: 2021-05-05 15:31
 */
public class ChildProcessDemo {

    public static void main(String[] args) throws InterruptedException, IOException {

        startCalc();

    }

    private static void printDictoryCmd() throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "dir");
        processBuilder.directory(new File("D:/"));
        Process process = processBuilder.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(), "GBK"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        int exitCode = process.waitFor();
        System.out.println("exitCode = " + exitCode);
    }

    private static void printIpConfigAll() throws IOException, InterruptedException {
        String[] cmd = {"ipconfig", "/all"};
        Process process = Runtime.getRuntime().exec(cmd);
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(), "GBK"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        int exitCode = process.waitFor();
        System.out.println("exitCode = " + exitCode);
    }

    private static void startCalc() throws IOException, InterruptedException {
        // Runtime.getRuntime().exec("calc");
        // Runtime.getRuntime().exec("notepad");
        // Runtime.getRuntime().exec("write");
        // Runtime.getRuntime().exec("mspaint");
        // Runtime.getRuntime().exec("osk");
        // Runtime.getRuntime().exec("mstsc");
        // Runtime.getRuntime().exec("cleanmgr");
        // Runtime.getRuntime().exec("explorer");
        // Runtime.getRuntime().exec("control");
        // Runtime.getRuntime().exec("mmc");
        // Runtime.getRuntime().exec("utilman");

        Runtime.getRuntime().exec("winver");

        /**
         * notepad
         */

    }

}
