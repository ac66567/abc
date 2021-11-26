package com.hn.a1028.am1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        boolean b = Collections.addAll(list, 123, 111, 154, 65, 13, 55);
        System.out.println(b);
        System.out.println(list);

        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(1);
        boolean b1 = Collections.addAll(set, 1, 1, 1, 111, 5);
        System.out.println(b1);
        System.out.println(set);

        Collections.shuffle(list);
        System.out.println(list);


        Collections.sort(list);
        System.out.println(list);
    }

}
