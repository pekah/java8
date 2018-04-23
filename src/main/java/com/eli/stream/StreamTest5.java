package com.eli.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by zhouyilin on 2018/2/15.
 */
public class StreamTest5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "eli");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        // flatMap,把三个数组的元素平摊到一个数组上，即（1, 2, 3, 4, 5, 6）
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
        stream.flatMap(theList -> theList.stream()).map(item -> item * item).forEach(System.out::println);
    }
}
