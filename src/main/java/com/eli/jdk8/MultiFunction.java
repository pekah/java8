package com.eli.jdk8;

/**
 * jdk自带只有Function接收一个参数、BiFunction接收2个参数。
 * MultiFunction可以接收多个参数
 * @param <T>
 * @param <R>
 */
@FunctionalInterface
public interface MultiFunction<T, R> {
    R apply(T... args);
}
