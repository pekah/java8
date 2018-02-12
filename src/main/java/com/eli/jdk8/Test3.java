package com.eli.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by pekah on 2018/2/9.
 */
public class Test3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hi");
        List<String> upperCaseList = new ArrayList<>();

        list.stream().map(item -> item.toUpperCase())
                .forEach(i -> upperCaseList.add(i));

        upperCaseList.forEach(System.out::println);

        System.out.println("--------------------------------");

        // 使用方法引用
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        Function<Integer, Long> funtion = (i) -> {return 1L;};
        Function<String, String> func = String::toUpperCase;
    }
}
