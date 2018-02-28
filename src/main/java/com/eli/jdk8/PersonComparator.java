package com.eli.jdk8;

/**
 * Created by pekah on 2018/2/13.
 */
public class PersonComparator {

    public int compareByAge(Person p1, Person p2){
        return p1.getAge() - p2.getAge();
    }
}
