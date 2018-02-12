package com.eli.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pekah on 2018/2/4.
 */
public class Test1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        for(Integer i : list){
            System.out.println(i);
        }


        System.out.println("----------------");

        list.forEach((i) -> System.out.println(i));

        System.out.println("-----------------");

        list.forEach(System.out::println);
    }
}
