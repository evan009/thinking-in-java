package com.evan.deepinjava.lange;

/**
 * @Desc: 原始数据类型
 * @author: liuawei
 * @date: 2021-04-30 9:08
 */
public class PrimiitiveDteType {


    /**
     * JAVA 是静态数据语言   所有的变量使用之前必须声明
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        /**
         * byte     8位      -128 ~ 127
         * short    16位     -32768 ~ 32767
         * int      32位     -2147483648 ~ 2147483647
         * long     64位     -9223372036854775808 ~  9223372036854775807
         * float    单精度32位
         * double   双精度64位
         * char
         * boolean
         */
        float floatValue = 1.0f;
        float dividFloat = 3.0f;
        System.out.println(floatValue/dividFloat);


        double doubleValue= 1.0;
        double dividDouble= 3.0;
        System.out.println(doubleValue/dividDouble);

    }

}
