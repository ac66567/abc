package com.hn.a1028.am1;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("hello");
        set.add("world");
        boolean hello = set.add("hello");
        System.out.println(hello);
        set.add("jack");
        set.add("lucy");

        System.out.println(set);


//        for (String s : set){
//            System.out.println(s);
//        }


    }
}
