package com.hn.a1029.am;

import java.lang.reflect.Method;
import java.util.Date;

@MyAnno(arr = 1)
@SuppressWarnings(value = "all")
public class Demo {
    @MyAnno(arr = 1)
    String name;

    @Override
    @SuppressWarnings(value =  "all")
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                '}';
    }

    @MyAnno(arr = 1)
    public static void main(String[] args) throws Exception {

//        Date date = new Date();
//
        @SuppressWarnings(value =  "all")
        Date date1 = new Date(0, 10, 29);
        System.out.println(date1);

        Class<? extends Demo> aClass = new Demo().getClass();
//        SuppressWarnings annotation = aClass.getAnnotation(SuppressWarnings.class);
//        System.out.println(annotation);
//
//        Method method = aClass.getMethod("toString");
//        System.out.println(method);
//        SuppressWarnings annotation1 = method.getAnnotation(SuppressWarnings.class);
//        System.out.println(annotation1);
//
//         MyAnno annotation2 = aClass.getAnnotation(MyAnno.class);
//        System.out.println(annotation2);

//        SuppressWarnings annotation = date1.getClass().getAnnotation(SuppressWarnings.class);
//        System.out.println(annotation.value());


    }
}
