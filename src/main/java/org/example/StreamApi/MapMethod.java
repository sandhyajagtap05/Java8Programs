package org.example.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class MapMethod {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sandhya");
        list.add("jagtap");
        list.add("java");
        list.add("shweta");
        list.add("jyoti");
        list.add("vaishnavi");
        list.add("nikita");
        list.add("gauri");

        // map used for Transforms each element in the stream(performing operation on each element and return all data)
        list.stream().map(String::length).forEach(System.out::println);

        list.stream().map(String::toUpperCase).forEach(System.out::println);

        list.stream().map(names->"name:"+ names).forEach(System.out::println);// add name varibale to each name in list

    }
}
