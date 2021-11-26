package com.hn.a1028.am1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo4 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 2, 41, 35, 436, 12, 36, 67, 876, 543, 23, 12);
        System.out.println(list);
        Collections.sort(list);
//        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(list);

    }
}
