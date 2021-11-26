package com.hn.a1029.pm;

import java.util.HashMap;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        String v = map.put(1, "zs");
        System.out.println(v);

        String v1 = map.put(1, "ww");
        System.out.println(v1);

        String zl = map.put(1, "zl");
        System.out.println(zl);

        String s = map.get(1);




//        String s = map.get(1);
//        System.out.println(s);
//
//        System.out.println(map);
//        String remove = map.remove(1);
//        System.out.println(remove);
//        System.out.println(map);

//        boolean b = map.containsKey(1);
//        System.out.println(b);
//        boolean zl1 = map.containsValue("zl");
//        System.out.println(zl1);

    }
}
