package com.evan.deepinjava.collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Desc: TreeSet示例
 * @see java.util.TreeSet
 * @author: evan
 * @date: 2021-11-30
 */
public class TreeSetExampls {

    public static void main(String[] args) {
        TreeSet<String> result = new TreeSet<>();
        result.add("");
        result.add("a");
        result.add("b");
        result.add("c");
        result.add("d");
        result.forEach(str -> System.out.println(str));
        TreeSet<String> result2 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        result2.add("");
        result2.add("a");
        result2.add("b");
        result2.add("c");
        result2.add("d");
        result2.add("e");
        result2.forEach(str -> System.out.println(str));

        result.addAll(result2);
        result.forEach(str -> System.out.println(str));
        System.out.println("取最近的元素");
        System.out.println(result.lower("b.1"));
        System.out.println(result.lower("b"));
        System.out.println(result.floor("b.1"));
        System.out.println(result.floor("b"));
        System.out.println(result.ceiling("b.1"));
        System.out.println(result.ceiling("b"));
        System.out.println(result.higher("b.1"));
        System.out.println(result.higher("b"));
        System.out.println(result.first());
        System.out.println(result.last());
        System.out.println(result.pollFirst());
        System.out.println(result.pollLast());
        result.forEach(str -> System.out.println(str));


        Set<String> subSet = result.headSet("b",true);
        subSet.forEach(s -> System.out.println(s));
        subSet = result.tailSet("b",false);
        subSet.forEach(s -> System.out.println(s));
        subSet.stream().iterator().next();

    }

}
