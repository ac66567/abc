package com.hn.a1029.am;

import javax.jdo.annotations.Value;
import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public  @interface MyAnno  /*extends Annotation*/ {

    String value() default "hello";

//    int  show1();
    int[] arr()  ;
}
