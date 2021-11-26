package com.hn.a1028.am1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("hello");
        set.add("jack");
        set.add("lucy");
        System.out.println(set);

//        for(String s: set){
//            System.out.println(s);
//        }

        // 迭代器
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
