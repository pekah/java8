package com.eli.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by zhouyilin on 2018/4/4.
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world");

        Stream source = list.stream();
        System.out.println("1");

        Stream map = source.map(item -> item);
        System.out.println("2");

        map.forEach(System.out::println);
        System.out.println("3");


    }
}
