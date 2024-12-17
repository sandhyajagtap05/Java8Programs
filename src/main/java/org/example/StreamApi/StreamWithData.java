package org.example.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamWithData {

    public static void main(String[] args) {
        List<String> addDataInStream=new ArrayList<>();

        addDataInStream.add("java");
        addDataInStream.add("lambda Expression");
        addDataInStream.add("FunctionalInterface");

        System.out.println(addDataInStream);

        addDataInStream.stream().forEach(s-> System.out.println(s));

        Stream.of("straemApi","methodRefrence");

    }
}
