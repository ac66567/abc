package com.hn.a1028.am;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Demo {
    @Test
    public void show() {
//        Student student = new Student();
//        System.out.println(student.getName());
////        int[] arr = {};
////        System.out.println(arr[2]);
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//        // 期望值, 计算结果
//        Assert.assertEquals(5050, sum);
//        System.out.println(sum);
    }
    @Test
    public void show1(){
        System.out.println("show1");
    }

    @Before
    public void beforeTest() {
        System.out.println("我在方法之前执行");
    }
    @After
    public void afterTest(){
        System.out.println("我在方法之后执行");
    }
}
