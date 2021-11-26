package com.hn.a1027.pm3;

public class Demo3 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog.getName()); //null
        System.out.println(dog.getAge());  //0

//        dog.setName("lisi");
//        System.out.println(dog.getName()); //lisi
//
//        dog.setAge(1000);
//        System.out.println(dog.getAge());


        Dog dog1 = new Dog("jack");
        System.out.println(dog1.getName());  //
        System.out.println(dog1.getAge());    //0

        Dog dog2 = new Dog(19);
        System.out.println(dog2.getName()); //
        System.out.println(dog2.getAge());  //19

        Dog dog3 = new Dog("lucy", 19);
        System.out.println(dog3.getName());
        System.out.println(dog3.getAge());
    }
}
