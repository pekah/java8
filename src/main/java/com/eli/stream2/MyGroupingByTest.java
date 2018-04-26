package com.eli.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Created by zhouyilin on 2018/3/12.
 */
public class MyGroupingByTest {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 10);
        Student s2 = new Student("zhangsan", 20);
        Student s3 = new Student("lisi", 10);

        List<Student> list = Arrays.asList(s1, s2, s3);

//        Map<String, List<Student>> result = list.stream().collect(Collectors.groupingBy(Student::getName));
//        System.out.println(result);
//        System.out.println("------");
//
//        Map<String, List<Student>> result2 = list.stream().collect(Collectors.groupingByConcurrent(Student::getName
//                , ConcurrentHashMap::new, Collectors.mapping(s -> s, Collectors.toList())));
//        System.out.println(result2);
//        System.out.println("------");

        Map<String, List<Student>> result3 = list.parallelStream().collect(Collectors.groupingByConcurrent(Student::getName
                , () -> {
                    System.out.println("supplier invoke");
                    return new ConcurrentHashMap<String, List<Student>>();
                }
                , new MyGroupingByCollector()));
        System.out.println(result3);
    }
}
