package com.hn.a1030.pm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo2 {

    public static void main(String[] args) {

        ArrayList<Student> stu = new ArrayList<>();
        Student stu1 = new Student("zs1", 10);
        Student stu2 = new Student("zs2", 20);
        Student stu3 = new Student("zs3", 30);
        Student stu4 = new Student("zs4", 40);
        Collections.addAll(stu, stu1, stu2, stu3, stu4);
        Iterator<Student> iterator = stu.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.getName() + " " + student.getAge());
        }

    }
}
