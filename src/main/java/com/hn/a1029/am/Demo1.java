package com.hn.a1029.am;

import java.lang.reflect.Method;

@MyAnno(arr = 1)
@SuppressWarnings(value = "all")
public class Demo1 {

    public void show() {

    }

    @MyAnno(arr = 1)
    @Override
    public String toString() {
        return "hello";
    }

    public static void main(String[] args) throws Exception {

        Demo1 demo1 = new Demo1();
        Class<? extends Demo1> aClass = demo1.getClass();
//        MyAnno annotation = aClass.getAnnotation(MyAnno.class);
//        System.out.println(annotation);
//
//        Method toString = aClass.getMethod("toString");
//        MyAnno annotation1 = toString.getAnnotation(MyAnno.class);
//        System.out.println(annotation1);

        SuppressWarnings annotation = aClass.getAnnotation(SuppressWarnings.class);
        System.out.println(annotation);

    }
}
