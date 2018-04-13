package com.eli.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by pekah on 2018/3/10.
 */
public class CollectorTest implements Collector<String, Set<String>, Set<String>> {

    @Override
    public Supplier<Set<String>> supplier() {
        return () -> {
            System.out.println("supplier invoke");
            return new HashSet<String>();
        };
    }

    @Override
    public BiConsumer<Set<String>, String> accumulator() {
        return Set<String>::add;
    }

    @Override
    public BinaryOperator<Set<String>> combiner() {
        return (set1, set2) -> {
            System.out.println("combiner invoke");
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<String>, Set<String>> finisher() {
        return t -> t;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED, Characteristics.CONCURRENT));
    }

    public static void main(String[] args) {
        final List<String> a = new ArrayList();
        a.add("1");
        System.out.println(a);


        List<String> list = Arrays.asList("hello", "hello", "World", "nihao");
        Set<String> result = list.parallelStream().collect(new CollectorTest());
        System.out.println(result);
    }
}
