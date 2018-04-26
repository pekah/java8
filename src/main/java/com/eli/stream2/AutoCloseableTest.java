package com.eli.stream2;

/**
 * Created by zhouyilin on 2018/3/17.
 */
public class AutoCloseableTest implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("close invoke");
    }

    public static void main(String[] args) throws Exception {
        try (AutoCloseableTest autoCloseableTest = new AutoCloseableTest()){
            System.out.println("main invoke");
        }
    }
}
