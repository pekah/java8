package com.eli.methodreference;

/**
 * Created by zhouyilin on 2017/5/7.
 */
public class MyClass1 implements MyInterface1 {

    @Override
    public void display() {
        MyInterface1.super.display();
    }
}
