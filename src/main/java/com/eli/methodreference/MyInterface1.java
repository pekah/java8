package com.eli.methodreference;

/**
 * Created by zhouyilin on 2017/5/7.
 */
public interface MyInterface1 {
    default void display(){
        System.out.println("MyInterface1");
    }
}
