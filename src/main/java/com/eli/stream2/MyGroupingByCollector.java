package com.eli.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Created by zhouyilin on 2018/3/12.
 */
public class MyGroupingByCollector implements Collector<Student, List<Student>, List<Student>> {
    @Override
    public Supplier<List<Student>> supplier() {
        return () -> {
            System.out.println("downStream supplier invoke");
            return new ArrayList<>();
        };
    }

    @Override
    public BiConsumer<List<Student>, Student> accumulator() {
        return List<Student>::add;
    }

    @Override
    public BinaryOperator<List<Student>> combiner() {
        return (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<Student>, List<Student>> finisher() {
        return t -> t;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED, Characteristics.CONCURRENT));
    }
}
