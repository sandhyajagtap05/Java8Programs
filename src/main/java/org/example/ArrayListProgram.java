package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {

    public static void main(String[] args) {


        List<Integer> l1 = new ArrayList<>();

        l1.add(11);
        l1.add(12);
        l1.add(13);
        l1.add(14);

        l1.forEach(n->{
            System.out.println(n);
        });


        l1.forEach(n->{
            n=n%10;
            System.out.println(n);
        });

    }
}
