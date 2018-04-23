package com.eli.defaultmethod;

/**
 * Created by pekah on 2018/2/13.
 */
public interface MyInterface2 {
    default void hello(){
        System.out.println("hello again");
    }
}
