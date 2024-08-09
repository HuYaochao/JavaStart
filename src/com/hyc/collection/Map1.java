package com.hyc.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */

public class Map1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        int a = map.get("a");
        System.out.println(a);
        map.remove("a");
        System.out.println(map.get("a"));
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsKey("b"));

        System.out.println(map.isEmpty());

        map.put("a", 10);
        System.out.println(map.get("a"));
        map.put("a", 20);
        System.out.println(map.get("a"));

        map.put("a", null);
        System.out.println(map.get("a"));

        map.put(null, 1);
        System.out.println(map.get(null));

        map.put(null, null);
        System.out.println(map.get(null));

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
