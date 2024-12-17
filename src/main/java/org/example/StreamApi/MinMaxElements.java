package org.example.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MinMaxElements {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(10);
        
        Optional<Integer> min =list.stream().min(Integer::compareTo);
        System.out.println(min);

        Optional<Integer> max=list.stream().max(Integer::compareTo);
        System.out.println(max);
    }
}
