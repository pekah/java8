package com.eli.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhouyilin on 2017/5/7.
 */
public class MethodReferenceTest {

    public static void main(String[] args) {

        Student s1 = new Student("zhangsan", 10);
        Student s2 = new Student("lisi", 90);
        Student s3 = new Student("wangwu", 50);
        Student s4 = new Student("zhaoliu", 40);

        List<Student> students = Arrays.asList(s1, s2, s3, s4);

//        students.sort((student1, student2) ->
//                Student.compareStudentByScore(student1, student2));
//
//        students.forEach(student -> System.out.println(student.getScore()));
//
//        System.out.println("--------");
//
//        //方法引用，类名::静态方法名
//        students.sort(Student::compareStudentByScore);
//        students.forEach(student -> System.out.println(student.getScore()));
//
//        //引用名::实例方法名
//        students.sort(new StudentComparator()::compareStudentByScore);
//        students.forEach(student -> System.out.println(student.getScore()));

        //sort方法的第一个入参调用compareByScore，并把第二个入参作为compareByScore方法的参数
        //类名::实例方法名
//        students.sort(Student::compareByScore);
//        students.forEach(student -> System.out.println(student.getScore()));

//        List<String> cities = Arrays.asList("shantou", "guangzhou", "shenzhen", "chongqin");
//        Collections.sort(cities, (city1, city2) -> city1.compareToIgnoreCase(city2));
//        cities.forEach(city -> System.out.println(city));
        //类名::实例方法名
//        Collections.sort(cities, String::compareToIgnoreCase);
//        cities.forEach(city -> System.out.println(city));

    }
}
