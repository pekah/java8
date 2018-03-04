package com.eli.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by pekah on 2018/2/13.
 */
public class StreamTest3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        System.out.println(list.stream().mapToInt(item -> item*2).sum());
        System.out.println("-----");

        list.stream().collect(Collectors.minBy(Comparator.comparingInt(Integer::new))).ifPresent(System.out::println);
        System.out.println("-----");

        list.stream().collect(Collectors.maxBy(Comparator.comparingInt(Integer::new))).ifPresent(System.out::println);
        System.out.println("-----");

        System.out.println(list.stream().collect(Collectors.averagingInt(Integer::new)));

        IntSummaryStatistics intSummaryStatistics = list.stream().collect(Collectors.summarizingInt(Integer::new));
        System.out.println(intSummaryStatistics);
        System.out.println("-----");

        System.out.println(list.stream().map((i) -> i+"").collect(Collectors.joining(", ")));

    }
}

