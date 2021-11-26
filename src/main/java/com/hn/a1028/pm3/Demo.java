package com.hn.a1028.pm3;

public class Demo {

    public static void main(String[] args) {

        Cat cat = new Cat();
//        System.out.println(cat.name);

        System.out.println(cat.getName());  //null
        cat.setName("tom");

        System.out.println(cat.getName());  //tom

        System.out.println(cat.getAge());   //0
        cat.setAge(10);
        System.out.println(cat.getAge());


        Cat cat1 = new Cat("lucy");
        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());

        Cat cat2 = new Cat("jack", 19);
        System.out.println(cat2.getName());
        System.out.println(cat2.getAge());

    }
}
