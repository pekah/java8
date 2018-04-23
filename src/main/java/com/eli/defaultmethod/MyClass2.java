package com.eli.defaultmethod;

/**
 * Created by pekah on 2018/2/13.
 * 当父类和实现接口的默认方法有一个相同的方法时，按照jdk的约定，父类的优先级更高，会调用父类的方法
 */
public class MyClass2 extends MyInterface1Impl implements MyInterface2 {

    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2();
        myClass2.hello();
    }
}
