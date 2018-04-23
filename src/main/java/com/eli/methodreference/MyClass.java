package com.eli.methodreference;

/**
 * Created by zhouyilin on 2017/5/7.
 */
public class MyClass implements MyInterface1, MyInterface2 {

    /**
     * 实现两个接口且里面的默认方法的名字是一样的，这时需要重写这个方法，并使用接口名.super去调用接口的默认方法
     */
    @Override
    public void display() {
        MyInterface2.super.display();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.display();

    }
}
