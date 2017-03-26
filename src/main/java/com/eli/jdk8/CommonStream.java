package com.eli.jdk8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Created by pekah on 2017/3/26.
 * 常用的流操作，包括
 * 1.collect(toList())
 * 2,map
 * 3,filter
 */
public class CommonStream {
    public static void main(String[] args) {
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
        System.out.println(collected);

        System.out.println("------------");

        List<String> upperCollected = Stream.of("a", "b", "c").map(string -> string.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCollected);

        System.out.println("=============");

        List<String> beginningWithNumber = Stream.of("a", "1ab", "2ab").filter(value -> Character.isDigit(value.charAt(0))).collect(Collectors.toList());
        System.out.println(beginningWithNumber);

        System.out.println("=============");


    }

}
