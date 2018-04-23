package com.eli.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

/**
 * Created by zhouyilin on 2018/2/16.
 */
public class StreamTest6 {

    public static void main(String[] args) {
        // 1,3,5,7,9
        Stream.iterate(1, item -> item + 2).filter(item -> item > 2)
                .mapToInt(item -> item * 2).skip(2).limit(2).min().ifPresent(System.out::print);

        IntSummaryStatistics intSummaryStatistics = Stream.iterate(1, item -> item + 2).filter(item -> item > 2)
                .mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());

    }
}
