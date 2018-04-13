package com.eli.stream2;

/**
 * Created by pekah on 2018/3/25.
 */
public class MyTest {

    public void test(Interface1 interface1){
        if(interface1 instanceof Interface2){
            System.out.println("interface2");
        }else {
            System.out.println("interface1");
        }
        interface1.method1();
    }

    public static void main(String[] args) {

        MyTest myTest = new MyTest();
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();

        myTest.test(class1);
        myTest.test(class2);



    }
}

interface Interface1{
    void method1();
}

interface Interface2{
    void method2();
}

class Class1 implements Interface1{
    @Override
    public void method1() {
        System.out.println("class1 method1");
    }
}

class Class2 implements Interface1, Interface2{

    @Override
    public void method1() {
        System.out.println("Class2 method1");
    }

    @Override
    public void method2() {
        System.out.println("class2 method2");
    }
}
