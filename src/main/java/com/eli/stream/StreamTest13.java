package com.eli.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by zhouyilin on 2018/2/18.
 */
public class StreamTest13 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 100, 19);
        Student s2 = new Student("lisi", 90, 20);
        Student s3 = new Student("wangwu", 90, 20);
        Student s4 = new Student("zhangsan2", 80, 18);

        List<Student> studentList = Arrays.asList(s1, s2, s3, s4);

//        Map<String, List<Student>> result = studentList.stream().collect(Collectors.groupingBy(Student::getName));
//        System.out.println(result);

//        Map<Integer, List<Student>> result = studentList.stream().collect(Collectors.groupingBy(Student::getScore));
//        System.out.println(result);

//        Map<String, Long> result = studentList.stream()
//                .collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
//        System.out.println(result);

//        Map<String, Double> result = studentList.stream()
//                .collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));
//        System.out.println(result);

//        Map<Boolean, List<Student>> result = studentList.stream()
//                .collect(Collectors.partitioningBy(student -> student.getScore() >= 90));
//        System.out.println(result);

        studentList.stream().collect(Collectors.minBy(Comparator.comparingInt(Student::getScore)))
                .ifPresent(s -> System.out.println(s.getName()));

    }
}
