package com.eli.stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

/**
 * Created by pekah on 2018/3/4.
 */
public class MyComparatorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "girl1", "welcome");

//        Collections.sort(list, (item1, item2) -> item1.length() - item2.length());
//        Collections.sort(list, (item1, item2) -> item2.length() - item1.length());

//        Collections.sort(list, Comparator.comparingInt(String::length).reversed());
//        Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());

//        list.sort(Comparator.comparingInt(String::length).reversed());

//        list.sort(Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
//        list.sort(Comparator.comparingInt(String::length).thenComparing(
//                (item1, item2) -> item1.toLowerCase().compareTo(item2.toLowerCase())
//        ));
//        list.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase)));

//        list.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder())));

        /*
            第二个thenComparing不生效。因为在对长度进行比较后，分成了两组：[5:{hello, world, girl1}, 7:{welcome}]
            此时第一组的长度且数组的元素数量>1，继续使用第一个thenComparing进行toLowerCase比较。
            比较后，分成了三组，分别是 [hello], [world], [girl1]。
            此时每一组的数据元素数量均为1，不会再继续使用第二个thenComparing
         */
        list.sort(Comparator.comparingInt(String::length).
                thenComparing(Comparator.comparing(String::toLowerCase)).
                thenComparing(Comparator.reverseOrder())
        );









        System.out.println(list);
    }

}
