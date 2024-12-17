package org.example.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterMethod {

    public static void main(String[] args) {


        List<Integer> names = new ArrayList<>();

        names.add(11);

        names.add(22);

        names.add(33);

        names.add(44);

        names.add(55);

        names.stream().filter(s->s>20).forEach(System.out::println);

        Stream<String> data=Stream.of("sandhya","shweta","vaishnavi","gauri","nikita");

        data.filter(n->n.length()>7).forEach(System.out::println);

        //use count method

        long count=Stream.of("sandhya","ram","gita").count();
        System.out.println(count);



    }
}
