package com.hn.a1028.am1;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("world");
        list.add("hello");
        list.add("jack");
        list.add("lucy");

        System.out.println(list);

//        list.addFirst("HELLO");
//        System.out.println(list);
//        list.addLast("JAVA");
//        System.out.println(list);
//
//        list.add("home");
//        System.out.println(list);

//        String first = list.getFirst();
//        System.out.println(first);
//        System.out.println(list.getLast());
//
//        String s = list.get(2);
//        System.out.println(s);

//        String s = list.removeFirst();
//        System.out.println(s);
//        System.out.println(list);
//        String s1 = list.removeLast();
//        System.out.println(s1);
//        System.out.println(list);

        System.out.println(list.pop());
        System.out.println(list);
        list.push("ooo");
        System.out.println(list);


//        list.clear();
//        System.out.println(list);
//        System.out.println(list.isEmpty());

    }
}
