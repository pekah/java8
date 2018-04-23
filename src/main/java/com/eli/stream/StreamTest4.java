package com.eli.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by zhouyilin on 2018/2/14.
 */
public class StreamTest4 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world");

//        String[] str = stream.toArray(length -> new String[length]);
//        String[] str = stream.toArray(String[]::new);
//
//        List<String> list = stream.collect(Collectors.toList());

//        List<String> list2 = stream.collect(() -> new ArrayList<>(), (theList, item) -> theList.add(item)
//                , (theList1, theList2) -> theList1.addAll(theList2)) ;

//        list2.forEach(System.out::println);


//        List<String> list3 = stream.collect(ArrayList::new, List::add, List::addAll);
//        list3.forEach(System.out::println);

//        Set<String> set = stream.collect(Collectors.toCollection(HashSet::new));

        String result = stream.collect(Collectors.joining());
        System.out.println(result);






    }
}
