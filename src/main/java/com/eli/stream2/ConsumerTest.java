package com.eli.stream2;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * Created by pekah on 2018/3/25.
 */
public class ConsumerTest {

    public void test(Consumer<Integer> consumer){
        if(consumer instanceof IntConsumer){
            System.out.println("this is IntConsumer");
        }
        consumer.accept(100);
    }

    public static void main(String[] args) {
        ConsumerTest consumerTest = new ConsumerTest();

        Consumer<Integer> consumer = i -> System.out.println(i);
        IntConsumer intConsumer = i -> System.out.println(i);

        System.out.println(consumer instanceof Consumer);
        System.out.println(intConsumer instanceof IntConsumer);

        consumerTest.test(consumer); // 面向对象方式
//        consumerTest.test(intConsumer); // 报错
//        consumerTest.test((Consumer)intConsumer);// 报错

        consumerTest.test(consumer::accept); // 函数式方式
        consumerTest.test(intConsumer::accept); // 函数式方式

        MyConsumer myConsumer = new MyConsumer();
        consumerTest.test(myConsumer);

        MyIntConsumer myIntConsumer = new MyIntConsumer();
        consumerTest.test(myIntConsumer);
    }
}

class MyConsumer implements Consumer<Integer>{
    @Override
    public void accept(Integer integer) {

    }
}

class MyIntConsumer implements IntConsumer, Consumer<Integer>{
    @Override
    public void accept(int value) {

    }

    @Override
    public void accept(Integer integer) {

    }
}