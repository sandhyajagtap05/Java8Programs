package org.example.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectMethod {

    //collect() method is a special case of reduction operation called mutable reduction operation because it returns mutable result container such as List or Set.
   // it is also for map and we required to write condition
    //Since a Map doesn't allow duplicate keys, we need to define how to generate unique keys for each element, and how to handle situations where multiple elements have the same key. This is why we need to provide key mapper and value mapper functions to specify what the key and value should be for each element.
    //
    //Additionally, if multiple elements map to the same key, we need to define how to handle these collisions. This is done by providing a merge function to handle situations when two elements have the same key.
    public static void main(String[] args) {

            List<String> list=new ArrayList<>();
            list.add("sandhya");
            list.add("jagtap");
            list.add("sandhya");
            list.add("shwetassss");
            list.add("jyoti");
            list.add("jagtap");
            list.add("sandhya");
            list.add("swapnali");

            List<String> collectingList=list.stream().limit(3).collect(Collectors.toList());
        System.out.println("convert into list"+" "+collectingList);

        Set<String> collectingSet=list.stream().limit(3).collect(Collectors.toSet());
        System.out.println("convert into set"+" "+collectingSet);

//        Map<Integer,String> collectingMap=list.stream().limit(3).collect(Collectors.toMap(String::length,s->s));
//        System.out.println("convert into set"+" "+collectingMap);

        list.stream().limit(3).forEach(System.out::println);
    }
}
