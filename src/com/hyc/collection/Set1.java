package com.hyc.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */

public class Set1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        for (String s : set) {
            System.out.println(s);
        }

//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }

//    public static void test(Set<String> set) {
//        String[] strs = new String[set.size()];
//        String[] result = set.toArray(strs);
//        System.out.println(strs);
//        System.out.println(result);
//        for (String str : result) {
//            System.out.println(str);
//
//        }
//
//    }
}
