package com.liuawei.deepinjava.lange;

/**
 * @Desc: 控制流程语句
 * @author: liuawei
 * @date: 2021-04-14 18:27
 */
public class ControlFlowStatements {

    /**
     * 决策语句(if-then if-then-else switch) 循环语句(for while do-while) 分支语句(break continue return)
     *
     * 是程序走特定的判断逻辑
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(286607100-1034809-1034809);


        // 判断语句 满足一个执行语句然后整体跳出
        ifFlow();
        /**
         * default:默认执行语句 break：跳出语句 不写后面的case都会执行一遍 byte, short, char, and int String,Enum,
         * 语句包括一个或者多个case和default组成。判断只能是字面量进行判断 特定的值
         *
         */
        switchFlow(3, 2021);

        whileFlow();
        doWhileFlow();
        branchingStatements();
    }

    public static void ifFlow() {
        // 成绩分类
        int grade = 55;
        if (grade >= 85) {
            System.out.println("grade is A");
        } else if (grade >= 70) {
            System.out.println("grade is B");
        } else if (grade >= 60) {
            System.out.println("grade is C");
        } else {
            System.out.println("grade is D");
        }

    }

    public static void switchFlow(Integer quarterly, Integer year) {

        String str = "字符串";
        switch (str) {
            case "字符串":
                System.out.println("中文");
                break;
            case "str":
                System.out.println("英文");
                break;
        }

        byte byteVale = 1;
        switch (byteVale) {

        }

        short shortVale = 1;
        switch (shortVale) {

        }

        char charValue = 'A';
        switch (charValue) {

        }

        Integer integerValue = new Integer(3);
        switch (integerValue) {

        }

        switch (quarterly) {
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Autumn");
            case 4:
                System.out.println("Winter");
            default:
                System.out.println("Seasons");
        }

        int daysOfMonth = 0;
        switch (2) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysOfMonth = 30;
            case 2: {
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    daysOfMonth = 28;
                } else {
                    daysOfMonth = 29;
                }
            }
                break;
        }
        System.out.println("days of month" + daysOfMonth);

    }

    /**
     *
     * initialization 初始化表达式在开始的时候执行一次
     * increment 每次迭代之后调用
     * termination 终止条件是false之后停止
     * 三个表达式都是可选的
     * for (initialization; termination; increment) {
     *     statement(s)
     * }
     */
    public static void forFlow() {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <= 10; i++) {
        }
        for (int numInt : number) {

        }
    }

    /**
     * while (expression) {
     *      statement(s)
     * }
     */
    public static void whileFlow() {
        // 打印100里的技术
        int i = 0;
        while (++i <= 100) {
            if (i % 2 == 1) {
                System.out.print(i + ",");
            }
        }

    }

    /**
     * do {
     *      statement(s)
     * } while (expression); 至少可以执行一次
     */
    public static void doWhileFlow() {
        int i =0;
        do{
            if (++i % 2 == 0) {
                System.out.print(i + ",");
            }
        }while(i<100);
    }

    /**
     * break 退出循环 标记调出到外层语句执行出
     * continue 跳出当前迭代，继续循环
     * return   直接返回
     */
    public static void branchingStatements() {

        int[] intArr = {0, 1, 2, 3};
        for (int i : intArr) {
            if (i == 2) {
                break;
            }
            System.out.println(i);
        }
        for (int i : intArr) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
        breakFlag:
        for (int i : intArr) {
            for (int j : intArr) {
                System.out.println(i+","+j);
                if (j == 2) {
                    break breakFlag;
                }
            }
        }

    }
}
