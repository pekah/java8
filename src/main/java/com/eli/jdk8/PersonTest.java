package com.eli.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Created by pekah on 2018/2/11.
 */
public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person("zhangsan", 10);
        Person p2 = new Person("lisi", 20);
        Person p3 = new Person("wangwu", 30);

        List<Person> persons = Arrays.asList(p1, p2, p3);

        PersonTest pt = new PersonTest();

        List<Person> getPersons =  pt.getPersonByUsername("zhangsan", persons);

        getPersons.forEach(p -> System.out.println(p.getName() + p.getAge()));

        System.out.println("---------");

        pt.getPersonByAge(20, persons).forEach(p -> System.out.println(p.getName() + p.getAge()));
    }


    public List<Person> getPersonByUsername(String username, List<Person> persons){
        return persons.stream().filter(person -> person.getName().equals(username)).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age, List<Person> persons){
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (myAge, myPersons) -> {
            return myPersons.stream().filter(p -> p.getAge() == age).collect(Collectors.toList());
        };

        return biFunction.apply(age, persons);
    }

}
