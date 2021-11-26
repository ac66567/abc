package com.hn.a1029.pm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "zs");
        map.put(6, "ll");
        map.put(3, "lls");
        map.put(4, "zl");
        map.put(5, "ww");
        map.put(91, "pp");
        System.out.println(map);

//        Set<Integer> set = map.keySet();
//        for (Integer k : set) {
////            System.out.println(i);
//            String v = map.get(k);
//            System.out.println(k + " " + v);
//        }

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        System.out.println(set);
        for (Map.Entry<Integer, String> m : set) {
            System.out.println(m);
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
    }
}
