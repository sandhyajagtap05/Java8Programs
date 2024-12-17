package org.example.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class CountMethod {

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


        // Returns the number of elements in a stream.
        long no=list.stream().count();
        System.out.println(no);
    }
}
