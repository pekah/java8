package com.eli.stream2;

/**
 * Created by pekah on 2018/4/1.
 */
public class LambdaTest {

    // r1是一个lambda的表达式，它的作用域是当前类
    Runnable r1 = () -> System.out.println(this);

    // r2是实现了Runnable接口的一个匿名类，它开辟了一个新的匿名类作用域
    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);
        }
    };


    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();

        lambdaTest.r1.run(); // 输出 com.eli.stream2.LambdaTest@4b9385    LambdaTest是当前类

        lambdaTest.r2.run(); // 输出 com.eli.stream2.LambdaTest$1@1311334。 当前类$1，其中1表示第一个匿名类
    }
}
