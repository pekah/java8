package com.eli.stream2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pekah on 2018/3/28.
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hehe");
        list.stream().map(item -> item).filter(item -> true).forEach(System.out::println);

    }
}
