package com.eli.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by pekah on 2018/2/11.
 */
public class PredicateTest2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream().filter(num -> num%2 == 0).forEach(num -> System.out.println(num));

        int i = 1;

        Predicate<Integer> predicate = Predicate.isEqual(i);
        System.out.println(predicate.test(1));
        System.out.println(predicate.test(2));


    }
}
