package com.hn.a1029.pm;

import java.util.LinkedHashMap;

public class Demo3 {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "zs");
        map.put(6, "zs");
        map.put(5, "zs");
        map.put(9, "zs");
        map.put(3, "zs");
        map.put(7, "zs");
        System.out.println(map);

    }
}
