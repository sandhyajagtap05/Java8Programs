package org.example.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class LimitMethod {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("sandhya");
        list.add("jagtap");
        list.add("java");
        list.add("shweta");
        list.add("jyoti");
        list.add("vaishnavi");
        list.add("nikita");
        list.add("gauri");

        list.stream().limit(4).forEach(System.out::println); //limit means first n elements limit(n)

        System.out.println("*********");

        list.stream().skip(3).forEach(System.out::println);//Returns a stream after skipping first n elements.
    }
}
