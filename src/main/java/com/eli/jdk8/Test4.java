package com.eli.jdk8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elizhou on 2018/4/8.
 */
public class Test4 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        Person p1 = new Person("zhangsan", 1);
        Person p2 = new Person("lisi", 2);

        personList.add(p1);
        personList.add(p2);

        personList.stream().map(person -> {
            person.setAge(3);
            return person;
        }).unordered().forEach(System.out::println);

        System.out.println(personList);
    }
}
