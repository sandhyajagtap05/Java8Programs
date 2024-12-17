package org.example.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class DistinctMethod {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("sandhya");
        list.add("jagtap");
        list.add("sandhya");
        list.add("shweta");
        list.add("jyoti");
        list.add("jagtap");
        list.add("sandhya");
        list.add("swapnali");


       list.stream().distinct().forEach(System.out::println);

    }
}
