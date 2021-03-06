package com.eli.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by zhouyilin on 2018/3/4.
 */
public class MySetCollector<T> implements Collector<T, Set<T>, Set<T>>{

    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked");
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoke");
        return Set<T>::add;
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoke");

        return (Set<T> set1, Set<T> set2) -> {
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Set<T>> finisher() {
        System.out.println("finisher invoke");
        return t -> t;
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoke");
//        Set<Characteristics> characteristicses = new HashSet<>();
//        characteristicses.add(Characteristics.UNORDERED);
//        characteristicses.add(Characteristics.IDENTITY_FINISH);
//        return characteristicses;
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH, Characteristics.UNORDERED));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "girl");
        Set<String> result = list.stream().collect(new MySetCollector<>());
        System.out.println(result);
    }
}
