package com.eli.jdk8;

import java.util.function.Predicate;

/**
 * Created by pekah on 2018/2/11.
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = str -> str.length() > 5;
        System.out.println(predicate.test("helloworld"));

        System.out.println(predicate.test("1"));
    }
}
