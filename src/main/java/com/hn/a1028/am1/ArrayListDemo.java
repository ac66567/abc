package com.hn.a1028.am1;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("hello");
        list.add("jack");
        list.add("lucy");
        System.out.println(list);

        list.add(2, "rose");

        System.out.println(list);

//        System.out.println(list);
//        String s = list.get(4);
//        System.out.println(s);
//
//        String remove = list.remove(4);
//        System.out.println(remove);
//        System.out.println(list);
//
//        String world = list.set(1, "WORLD");
//        System.out.println(world);
//        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (String s : list) {
//            System.out.println(s);
//        }
    }
}
