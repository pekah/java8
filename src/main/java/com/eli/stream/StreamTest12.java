package com.eli.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhouyilin on 2018/2/18.
 */
public class StreamTest12 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("hi", "hello");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu");

//        list1.forEach(item1 -> {
//            list2.forEach(item2 -> {
//                System.out.println(item1 + ":" + item2);
//            });
//
//        });

        List<String> stringList = list1.stream().flatMap(item -> list2.stream().map(item2 -> item + " " + item2)).collect(Collectors.toList());
        stringList.forEach(System.out::println);

    }
}
