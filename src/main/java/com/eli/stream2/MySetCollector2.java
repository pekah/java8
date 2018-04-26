package com.eli.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Created by zhouyilin on 2018/3/4.
 */
public class MySetCollector2<T> implements Collector<T, Set<T>, Map<T, T>>{

    @Override
    public Supplier<Set<T>> supplier() {
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        return Set<T>::add;
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        return (s1, s2) -> {
            s1.addAll(s2);
            return s1;
        };
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        return (t) -> {
            HashMap<T, T> map = new HashMap<T, T>();
            t.forEach(item -> map.put(item, item));
            return map;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("welcome");

        Map<String, String> result = set.stream().collect(new MySetCollector2<>());
        System.out.println(result);
    }
}
