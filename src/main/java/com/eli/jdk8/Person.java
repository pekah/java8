package com.eli.jdk8;

/**
 * Created by pekah on 2018/2/11.
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static int compareByAge(Person p1, Person p2){
        return p1.getAge() - p2.getAge();
    }

    public int compareByInputAge(Person p){
        return this.age - p.getAge();
    }

    public int compareByInputName(Person p){
        return this.name.compareToIgnoreCase(p.getName());
    }
}
