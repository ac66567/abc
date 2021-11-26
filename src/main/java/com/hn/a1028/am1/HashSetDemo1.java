package com.hn.a1028.am1;

import java.util.HashSet;

public class HashSetDemo1 {

    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        Student stu1 = new Student("zs", 19, "男");
        Student stu2 = new Student("zs1", 19, "男");
        Student stu3 = new Student("zs", 20, "男");
        Student stu4 = new Student("zs", 19, "男");

        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);

        System.out.println(set);


    }
}
