package com.evan.thinking.java.segmentfault.xmg.lange;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @Desc: 操作符
 * @author: liuawei
 * @date: 2021-04-14 15:06
 */
public class Operators {

    /**
     * 操作符优先级
     * i++和++i
     * null 是 Object对象？
     * 
     * @param args
     */
    public static void main(String[] args) {
        int i = 10;
        int n = ++i%5;
        System.out.println(i+","+n);


        // 赋值运算符
        System.out.println("assignment operators");
        testAssignmentOperator();
        // 算数运算符
        System.out.println("arithmetic operators");
        testArithmeticOperators();
        // 一元运算符
        System.out.println("unary operators");
        testUnaryOperators();
        System.out.println("equality and relational operators");
        // 相等和关系操作符
        testEqualitySndRelational();
        System.out.println("condition operators");
        // 条件操作符
        testConditionalOperators();
        System.out.println("type comparison operators");
        // 类型比较运算符
        testTypeComparisonOperators();
        // 位运算
        System.out.println("bitwise operators");
        testBitwiseOperators();
    }

    /**
     * 一元运算符
     *
     * 代码 result + + ; 和 + + result; 最终结果将增加一个。唯一的区别是前缀版本(++result)计算为递增值，而后缀版本(result++)计算为原始值。
     *
     * + - ++ -- ！
     */
    private static void testUnaryOperators() {
        int result = 928;
        System.out.println(+result);
        System.out.println(-result);
        System.out.println(result++);
        System.out.println(result--);
        System.out.println(++result);
        System.out.println(--result);

        boolean booleanResult = false;
        System.out.println(!booleanResult);

    }

    /**
     * 算数运算符 +：加法运算，字符串拼接 -：减法运算 *: 乘法运算 /: 除法运算 %: 求余运算
     */
    public static void testArithmeticOperators() {

        int a = 10;
        int b = 4;

        // 加法运算
        System.out.println(a + b);
        // 减法运算
        System.out.println(a - b);
        // 乘法运算
        System.out.println(a * b);
        // 除法运算
        System.out.println(a / b);
        // 取余运算
        System.out.println(a % b);

        // 字符串拼接
        String str = "evan str";
        System.out.println(a + b + str + a + b);

        // 语法糖
        System.out.println(a += 2);

    }

    /**
     * 赋值运算符
     *
     * 1：将右边的值赋值给左边的变量 2：将对象的引用地址赋值给左边的变量
     */
    public static void testAssignmentOperator() {

        int i = 1;

        String str = new String("Str");

    }

    /**
     * 相等和关系运算法 == > >= < <=
     */
    public static void testEqualitySndRelational() {

        int a = 9;
        int b = 10;
        // primitive valuse 比较记得要用==
        System.out.println("9==10   " + (a == b));
        System.out.println("10>9    " + (b > a));
        System.out.println("10>10   " + (b > b));
        System.out.println("10>=10  " + (b >= b));
        System.out.println("9<10    " + (a < b));
        System.out.println("10<10   " + (b < b));
        System.out.println("10<=10  " + (b <= b));
    }

    /**
     * 条件运算符 && 条件与 || 条件或 ?: 三元操作符
     *
     *
     */
    public static void testConditionalOperators() {
        // 表达式中&& 和 || 存在短路操作
        // condition1 && condition2 两个都是true的时候才会true condition1==false的时候 condition2不会执行
        // condition1 || condition2 两个表达式有一个是true的时候就是true condition1==true condition2不会执行
        if (("evan".startsWith("e") && ("evan".length() == 4))) {
            System.out.println("evan.startsWith(e)&&(evan.length()==4");
        }

        if (("evan".startsWith("b") || ("evan".length() == 4))) {
            System.out.println("evan.startsWith('v')||('evan'.length()==4");
        }

        // condition ? value1 : value2 condition是true 返回value1 否贼返回value2
        System.out.println(LocalDate.now().getYear()==2021?"2021年是困难的一年":"以后的每一年都是困难的一年");

    }

    /**
     * 类型比较运算符
     * instanceof 判断当前对象是 类的实例，子类的实例，实现特定接口的实例
     */
    public static void testTypeComparisonOperators(){
        Integer intValue = new Integer(2);
        Double doubleValue = new Double(3);
        if (intValue instanceof Number){
            System.out.println("Integer instanceof Number");
        }
        if (doubleValue instanceof Number){
            System.out.println("double instanceof Number");
        }
        if (doubleValue instanceof Object){
            System.out.println("double instanceof Object");
            System.out.println("任何对象都extendsObject");
        }
        if (doubleValue instanceof Serializable){
            System.out.println("double instanceof Serializable");
        }
        if (null instanceof Object){
            System.out.println("null instanceof Object");
        }else {
            System.out.println("null not instanceof Object");
        }

    }

    /**
     * 位运算  整型执行按位和位移操作的运算符
     * ~ 按位非    数字的每一位0变成1 1变成0
     * & 按位于    每一位进行比较 都是1的变成1构造
     * | 按位或    每一位
     * ^ 按位异或
     * >>
     * >>>
     * <<
     */
    public static void testBitwiseOperators(){
        int bitmask = 0x000F;
        int val = 0x2222;
        int valMax = Integer.MAX_VALUE;
        System.out.println(~valMax);
        System.out.println(~valMax==Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE>>2);
        System.out.println(Integer.MIN_VALUE>>>2);
        System.out.println(valMax);
        System.out.println(val);
        System.out.println("~val=    "+~val);
        System.out.println("val&bitmask"+(val&bitmask));
        System.out.println(val|bitmask);
        System.out.println(val^bitmask);
        System.out.println(val>>2);
        System.out.println(val>>>2);
        System.out.println(val<<2);
        System.out.println(val<<2);
    }

}
