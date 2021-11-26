package com.hn.a1030.pm;

import java.util.*;

public class Demo1 {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        Collections.addAll(set, 1, 2, 3, 45, 5);

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(set);
        set.addAll(list);

//        ArrayList<Map.Entry> list1 = new ArrayList<>();
//        HashMap<Integer, String> map = new HashMap<>();
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        list1.addAll(map.entrySet());

    }
}
