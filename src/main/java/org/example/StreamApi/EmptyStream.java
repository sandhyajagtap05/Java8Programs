package org.example.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmptyStream {
    public static void main(String[] args) {
//        Stream<String> s1=Stream.empty();
//       Stream<String> s2= Stream.of("sandhya","shweta","jagtap");
//
//        System.out.println(s2.count());
//
//        System.out.println(s1.count());

        List<String> addList=new ArrayList<>();
        addList.add("sandhya");
        addList.add("shweta");
        addList.add("java");

        addList.stream().forEach(a-> System.out.println(a));


    }
}
