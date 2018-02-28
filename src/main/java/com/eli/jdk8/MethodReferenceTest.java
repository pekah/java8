package com.eli.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by pekah on 2018/2/12.
 * 方法引用共分为4类
 1，类名::静态方法名
 2，引用名（对象名）::实例方法名
 3，类名::实例方法名
 4，构造方法引用：  类名::new

 */
public class MethodReferenceTest {

    public String getString(String str, Supplier<String> supplier){
        return supplier.get() + str;
    }

    public String getStringByFunction(String str, Function<String, String> function){
        return function.apply(str);
    }

    public static void main(String[] args) {
        Person p1 = new Person("zhangsan", 20);
        Person p2 = new Person("lisi", 10);
        Person p3 = new Person("wangwu", 30);
        Person p4 = new Person("zhaoliu", 40);

        List<Person> persons = Arrays.asList(p1, p2, p3, p4);

        // 1，类名::静态方法名
//        persons.sort((tp1, tp2) -> Person.compareByAge(tp1, tp2));
        persons.sort(Person::compareByAge);
        persons.forEach((p) -> System.out.println(p.getAge() + p.getName()));

        System.out.println("---------------");

        //  2，引用名（对象名）::实例方法名
        PersonComparator personComparator = new PersonComparator();
        persons.sort(personComparator::compareByAge);
        persons.forEach((p) -> System.out.println(p.getAge() + p.getName()));

        System.out.println("---------------");

        // 3，类名::实例方法名
//        persons.sort(Person::compareByInputAge);
//        persons.forEach((p) -> System.out.println(p.getAge() + p.getName()));

        System.out.println("---------------");

//        List<String> cityList = Arrays.asList("shenzhen", "guangzhou", "beijing", "shantou");
//        Collections.sort(cityList, String::compareToIgnoreCase);
//
//        cityList.forEach(System.out::println);

        // 4，构造方法引用：  类名::new
        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        System.out.println(methodReferenceTest.getString("hello", String::new));
        System.out.println(methodReferenceTest.getStringByFunction("world", String::new));

    }
}
