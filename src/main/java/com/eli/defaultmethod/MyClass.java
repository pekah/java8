package com.eli.defaultmethod;

/**
 * Created by pekah on 2018/2/13.
 */
public class MyClass implements MyInterface1, MyInterface2{

    @Override
    public void hello() {
        // 当类实现了两个接口，并且两个接口的默认方法同名，可以使用接口名.super.方法名来解决冲突
        MyInterface2.super.hello();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.hello();
    }
}
