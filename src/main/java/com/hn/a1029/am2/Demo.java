package com.hn.a1029.am2;

public class Demo {

    public static void main(String[] args) {

        // 工厂方法
//        FactoryDemo factoryDemo = new FactoryDemo();
//        QQ qq = factoryDemo.createQQ();
//        qq.send();
//
//        YY yy = factoryDemo.createYY();
//        yy.send();

        // 静态工厂方法
        QQ qq1 = FactoryDemo.createQQ();

    }
}
