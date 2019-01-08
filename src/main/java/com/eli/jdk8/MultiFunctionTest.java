package com.eli.jdk8;

public class MultiFunctionTest {

    public static void main(String[] args) {
        MultiFunction<Integer, Long> multiFunction = integers -> {
            Long sum = 0L;
            for (Integer arg : integers) {
                sum += arg;
            }

            return sum;
        };

        System.out.println(multiFunction.apply(1,2,3,4));
    }
}
