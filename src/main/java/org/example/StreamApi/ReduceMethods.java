package org.example.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceMethods {

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

//       String result= String.valueOf(list.stream().reduce((a, b)->a+" "+b));
//        System.out.println(result);

       int sum =list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);

        // here is another form of reduce() method which takes no initial value. But returns an Optional object.

        Optional<Integer> result = Optional.empty();
        Optional substract =result.stream().reduce((a,b)->a+b);
        System.out.println(substract.orElse(0));
    }
}
