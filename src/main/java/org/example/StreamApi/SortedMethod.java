package org.example.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class SortedMethod {
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

        list.stream().sorted().forEach(System.out::println); //sorted according to its names

        System.out.println("*******");

        list.stream().sorted((name1,name2)->name1.length()-name2.length()).forEach(System.out::println); //sorted according to its length


    }
}
