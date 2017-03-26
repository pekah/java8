package com.eli.jdk8;

/**
 * Created by pekah on 2017/3/23.
 */

@FunctionalInterface
interface MyInterface2{
    void test();
//    void test2(); //报错，只能定义一个抽象方法
    String toString();//合法，可以声明一个来自java.lang.Object的方法
}

public class MyTest2 {
    public void test(MyInterface2 interface2){
        System.out.println(1);
        interface2.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2();
        myTest2.test(new MyInterface2() {
            @Override
            public void test() {
                System.out.println("hello");
            }
        });

        System.out.println("===============");

        myTest2.test(() -> {
            System.out.println("hello");
        });

        System.out.println("===============");

        MyInterface2 myInterface2 = () -> {
            System.out.println("hello");
        };


    }
}
