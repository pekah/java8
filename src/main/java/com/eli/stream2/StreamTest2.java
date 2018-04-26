package com.eli.stream2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhouyilin on 2018/4/4.
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world");
        list.stream().map(item -> item).filter(item -> true).forEach(System.out::println);
    }
}
