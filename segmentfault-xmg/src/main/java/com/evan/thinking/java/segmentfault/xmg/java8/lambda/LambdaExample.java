package com.evan.thinking.java.segmentfault.xmg.java8.lambda;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Lambda表达式
 * 
 * @author: evan
 * @date: 2021/12/11
 */
public class LambdaExample {

    public static void main(String[] args) {
        lambdaWriting();
        functionWriting();
        orginalWriting();
    }

    private static void orginalWriting() {
        Collection<String> strList = new ArrayList<>();
        strList.add("xiao");
        strList.add("zhu");
        strList.add("pei");
        strList.add("qi");
        Collection<Integer> intList = new ArrayList<>();
        for (String str : strList) {
            intList.add(str.length());
        }
        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()) {
            if (!(iterator.next() <= 3)) {
                iterator.remove();
            }
        }
        Integer result = Collections.max(intList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        System.out.println("orginal result: " + result);

    }

    private static void functionWriting() {
        Optional<Integer> result = Stream.of("xiao", "zhu", "pei", "qi")
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return s.length();
                    }
                }).filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer l) {
                        return l <= 3;
                    }
                }).max(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return Integer.compare(o1, o2);
                    }
                });
        System.out.println("function result: " + result.get());
    }

    /**
     * lambda 写法
     */
    private static void lambdaWriting() {
        Optional<Integer> result =
            Stream.of("xiao", "zhu", "pei", "qi")
                    .map(s -> s.length())
                    .filter(l -> l <= 3)
                    .max((Integer::compare));
        System.out.println("lambda result: " + result.get());
    }

}
