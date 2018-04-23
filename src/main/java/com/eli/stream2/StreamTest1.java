package com.eli.stream2;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by pekah on 2018/3/2.
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 100);
        Student s2 = new Student("lisi", 100);
        Student s3 = new Student("zhangsan", 80);
        Student s4 = new Student("wangwu", 80);
        Student s5 = new Student("zhaoliu", 70);
        Student s6 = new Student("hehe", 90);

        List<Student> studentList = Arrays.asList(s1, s2, s3, s4, s5, s6);

        List<Student> studentListl = studentList.stream().collect(Collectors.toList());
        studentListl.forEach(System.out::println);
        System.out.println("-----");

        System.out.println("count:" + studentList.stream().collect(Collectors.counting()));
        System.out.println("count:" + studentList.stream().count());
        System.out.println("-----");

        studentList.stream().collect(Collectors.minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        System.out.println("-----");

        studentList.stream().collect(Collectors.maxBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        System.out.println("-----");

        System.out.println("平均数：" + studentList.stream().collect(Collectors.averagingInt(Student::getScore)));
        System.out.println("求和：" + studentList.stream().collect(Collectors.summarizingInt(Student::getScore)));
        System.out.println("-----");

        IntSummaryStatistics intSummaryStatistics = studentList.stream().collect(Collectors.summarizingInt(Student::getScore));
        System.out.println("intSummaryStatistics：" + intSummaryStatistics);
        System.out.println("-----");

        System.out.println(studentList.stream().map(ts1 -> ts1.getName()).collect(Collectors.joining()));
        System.out.println(studentList.stream().map(ts1 -> ts1.getName()).collect(Collectors.joining(", ")));
        System.out.println(studentList.stream().map(ts1 -> ts1.getName()).collect(Collectors.joining(", ", "<begin>", "<end>")));
        System.out.println("-----");

        Map<Integer, Map<String, List<Student>>> map1 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getScore, Collectors.groupingBy(Student::getName)));
        System.out.println(map1);
        System.out.println("-----");

        Map<Boolean, Map<Boolean, List<Student>>> map2 = studentList.stream()
                .collect(Collectors.partitioningBy(ts1 -> ts1.getScore() >= 80, Collectors.partitioningBy(ts1 -> ts1.getScore() >= 90)));
        System.out.println(map2);

        Map<Boolean, Long> map3 = studentList.stream()
                .collect(Collectors.partitioningBy(ts1 -> ts1.getScore() >= 90, Collectors.counting()));
        System.out.println(map3);






    }
}
