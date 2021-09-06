package com.evan.deepinjava.lange;

/**
 * @Desc: 表达式 语句 代码块
 * @author: liuawei
 * @date: 2021-04-14 18:06
 */
public class ExpressionsStatementsAndBlocks {

    /**
     * expressions are the core components of statements; statements may be grouped into blocks.
     * @param args
     */
    public static void main(String[] args) {

        // expressions 表达式
        // 表达式是由变量、运算符和方法调用组成的构造
        Integer value1 = 5;
        Integer value2 = 4;
        Integer result = value1 + value2;

        // statements 语句 ;结束
        // 控制语句
        // 声明语句
        // 表达式语句
        // 1 赋值表达式
        // 2 ++ 和 --
        // 3 方法调用
        // 4 对象创建
        result = value1 + value1;
        result ++;
        result --;
        testStatement();
        String str;
        str = new String("2021");

        // blocks 代码块
        // {}中的一个和多个语句
        {
            result = ~result;
            result++;
        }

    }

    private static void testStatement(){

    }

}
