package com.eli.jdk8;

import java.util.Optional;

/**
 * Created by pekah on 2018/2/12.
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> nullValue = Optional.empty();
        Optional<String> hello = Optional.of("hello");

        if(hello.isPresent()){
            System.out.println(hello.get());
        }

        System.out.println("--------------");

        hello.ifPresent(item -> System.out.println(item));// 推荐

        System.out.println("--------------");

        System.out.println(nullValue.orElse("world"));

        System.out.println("--------------");

        System.out.println(nullValue.orElseGet(() -> "你好"));

    }
}
