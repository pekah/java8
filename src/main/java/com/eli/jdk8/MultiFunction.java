package com.eli.jdk8;

@FunctionalInterface
public interface MultiFunction<T, R> {

    R apply(T... args);
}
