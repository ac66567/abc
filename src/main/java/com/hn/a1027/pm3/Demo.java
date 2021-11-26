package com.hn.a1027.pm3;

public class Demo {

    public static void main(String[] args) {

        //创建对象
        Dog d = new Dog();
//        String name = d.name;
        String name = d.getName();
        System.out.println(name);

//        d.sleep();
        System.out.println(d);

//        d.name = "zs";
        d.setName("zs");
//        System.out.println(d.name);
        System.out.println(d.getName());
//        d.age = 100;
//        System.out.println(d.age);
        System.out.println(d.getAge());
        d.setAge(100);
        System.out.println(d.getAge());

        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        System.out.println(dog);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

    }
}
