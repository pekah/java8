package com.eli.stream;

import java.util.Arrays;
import java.util.List;

/**
 * hell
 * hello
 * 5
 * 因为流的短路，第一个元素不符合长度为5，会打印出来，第二个元素符合，也会打印出来，并打印5。
 * 此时因为只查询一个符合条件的元素，查询结束，因此不会再打印world
 */
public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hell", "hello", "world");

        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(len -> len == 5).findFirst().ifPresent(System.out::println);
    }
}
