package com.eli.jdk8;

import java.util.function.Supplier;

/**
 * Created by pekah on 2018/2/11.
 */
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello world";
        System.out.println(supplier.get());

        Supplier<Student> studentSupplier = Student::new;
        System.out.println(studentSupplier.get().getName());
    }
}

class Student{
    private String name = "zhangsan";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
