package com.hn.a1026.pm;

public class CatDemo {

    public static void main(String[] args) {
        //  一只小猫
        Cat cat = new Cat();
        System.out.println(cat); // 地址值

//        int[] arr = new int[3];
//        System.out.println(arr);
//        arr[0] = 10;

        String a = cat.name;
        System.out.println(a);
        int age = cat.age;
        System.out.println(age);

        cat.name = "zs";
        System.out.println(cat.name);

        // 局部变量 ,没有默认值, 不赋值不能使用
//        int c;
//        System.out.println( c );

//        cat.eat();
//        cat.sleep();
    }
}
