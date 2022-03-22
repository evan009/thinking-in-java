package com.evan.thinking.java.segmentfault.xmg.collection.set;

import java.util.EnumSet;

/**
 * @Desc: EnumSet示例
 * @see java.util.EnumSet
 * @author: evan
 * @date: 2021-11-30
 */
public class EnumSetExample {

    public static void main(String[] args) {
        EnumSet set = EnumSet.allOf(DayEnum.class);
        set.forEach(str -> System.out.println(str));
        set = EnumSet.of(DayEnum.SATURDAY, DayEnum.SUNDAY);
        set.forEach(str -> System.out.println(str));
        set.retainAll(set);

    }

}
