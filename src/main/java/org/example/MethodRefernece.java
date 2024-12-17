package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodRefernece {


    public static void main(String[] args) {

        List<Integer> l1= Arrays.asList(1,2,3,4,5,6);

        // using lambda expression
        l1.stream().forEach(i->System.out.println(i));


        // using method reference
        l1.stream().forEach(System.out::println);

        l1.stream().map(i->i*2).forEach(System.out::println);


    }
}
