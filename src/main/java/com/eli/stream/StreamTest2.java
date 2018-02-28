package com.eli.stream;

import java.util.stream.IntStream;

/**
 * Created by pekah on 2018/2/13.
 */
public class StreamTest2 {

    public static void main(String[] args) {
        IntStream.of(new int[]{5, 6, 7}).forEach(System.out::println);

        System.out.println("--------");

        IntStream.range(5, 8).forEach(System.out::println);

        System.out.println("---------");

        IntStream.rangeClosed(5, 7).forEach(System.out::println);

    }
}
