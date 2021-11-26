package com.hn.a1028.am1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Demo3 {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        Collections.addAll(set, 1, 24, 45, 56, 76, 99);
        System.out.println(set);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);


        boolean b = list.addAll(set);
        System.out.println(b);
        System.out.println(list);

        HashSet<Integer> set1 = new HashSet<>();
        boolean b1 = set1.addAll(list);
        System.out.println(b1);
        System.out.println(set1);

    }
}
