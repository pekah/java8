package com.eli.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhouyilin on 2018/2/17.
 */
public class StreamTest11 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world", "hello girl");

        list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);

    }
}
