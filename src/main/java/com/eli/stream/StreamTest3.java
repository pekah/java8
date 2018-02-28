package com.eli.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pekah on 2018/2/13.
 */
public class StreamTest3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        System.out.println(list.stream().mapToInt(item -> item*2).sum());
    }
}

