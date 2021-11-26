package com.hn.a1029.am1;

public class Demo {

    public static void main(String[] args) {

        FactoryDemo factoryDemo = new FactoryDemo();
        Sender produce = factoryDemo.produce(2);
        Sender produce1 = factoryDemo.produce(1);
        produce.send();
        produce1.send();

    }
}
