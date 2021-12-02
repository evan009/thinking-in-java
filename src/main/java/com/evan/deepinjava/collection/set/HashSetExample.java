package com.evan.deepinjava.collection.set;

import java.util.HashSet;
import java.util.function.Consumer;

/**
 * @Desc: HashSet示例
 * @author: evan
 * @date: 2021-11-30
 */
public class HashSetExample {


    public static void main(String[] args) {
        HashSet<String> result = new HashSet<>();
        result.add("str1");
        result.add("str1");
        result.add("str2");
        result.add("str3");
        result.add("");
        result.add(null);

        result.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println(result.size());
        System.out.println(result.isEmpty());
        System.out.println(result.contains("str"));
        System.out.println(result.remove("str1"));
        for (String s : result) {
            System.out.println(s);
        }


        System.out.println("clone start");
        HashSet<String> result2 = new HashSet<>();
        result2 = (HashSet<String>) result.clone();
        result.clear();
        result.forEach(str->{System.out.println(str);});
        result2.forEach(str->{System.out.println(str);});

    }

}
