package com.eli.defaultmethod;

/**
 * Created by pekah on 2018/2/13.
 */
public interface MyInterface1 {

    default void hello(){
        System.out.println("hello world");
    }
}
