package org.example.ForEachMethodInternalWorking;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String[] args) {

        List<Integer> l1= Arrays.asList(4,5,6,7,8);

        // using ananymous inner class
//        Consumer<Integer> c=new Consumer<Integer>() {
//            @Override
//            public void accept(Integer i) {
//                System.out.println(i);
//            }
//        };
//        l1.forEach(c);
//

        // using lambda expression
//        Consumer<Integer> c=(Integer i)->System.out.println(i);
//
//        l1.forEach(c);

  // using foreach method in java 8
        l1.forEach(i-> System.out.println(i));

    }
}
