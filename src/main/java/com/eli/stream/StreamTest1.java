package com.eli.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by pekah on 2018/2/13.
 */
public class StreamTest1 {

    public static void main(String[] args) {
        Stream stream1 = Stream.of("hello", "world", "hello world");

        String[] strs = new String[]{"hello", "world", "hello world"};
        Stream stream2 = Stream.of(strs);
        Stream stream3 = Arrays.stream(strs);

        List<String> list = Arrays.asList(strs);
        Stream stream4 = list.stream();
    }
}
