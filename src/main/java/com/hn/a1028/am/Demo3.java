package com.hn.a1028.am;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo3 {

    public static void main(String[] args) throws Exception {

        Class<Student> stu = Student.class;

//        Field age = stu.getDeclaredField("age");
//        System.out.println(age);
//        age.setAccessible(true);
//        Student student = new Student("zs", 19);
//        Object o = age.get(student);
//        System.out.println(o);
//
//        age.set(student,88);
//        System.out.println(student.getAge());
//        Object o1 = age.get(student);
//        System.out.println(o1);
//
//        Field id = stu.getDeclaredField("id");
//        id.setAccessible(true);
//        Student student = new Student(18, 100001);
//        Object o = id.get(student);
//        System.out.println(o);

//        Student student = stu.newInstance();
//        System.out.println(student.getName());

//        Method getName = stu.getMethod("setName", Class.forName("java.lang.String"));
//        Student student = new Student("jack", 19);
//        Object invoke = getName.invoke(student, "lucy");
//        System.out.println(invoke);
//        System.out.println(student.getName());
//        System.out.println(getName);
//        System.out.println(getName.getName());

    }
}
