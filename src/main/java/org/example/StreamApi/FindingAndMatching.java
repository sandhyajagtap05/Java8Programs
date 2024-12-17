package org.example.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingAndMatching {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("sandhya");
        list.add("first");
        list.add("jagtap");
        list.add("sandhya");
        list.add("shwetassss");
        list.add("jyoti");
        list.add("jagtap");
        list.add("sandhya");
        list.add("swapnali");
        list.add("sandhya");

//        if(list.stream().anyMatch((name)->name.length()>5)){
//            System.out.println("there is name whose length is greter than 5");
//        }

        // any match
        System.out.println(list.stream().anyMatch((name)->name.length()>5));

        // all match
        if(list.stream().allMatch((name)->name.length()>5)){
            System.out.println("return true ");
        }
        else {
            System.out.println("not match find");
        }

        // none match
        if(list.stream().noneMatch((name)->name.startsWith("z"))){
            System.out.println("none match found");
        }

        // find first

        Optional<String> findFirst1 =list.stream().findFirst();
        System.out.println(findFirst1);

        Optional<String> findFirst =list.stream().filter(n->n.length()>8).findFirst();

        System.out.println(findFirst);

        //find any

        Optional<String> findAnyElement=list.stream().filter(n->n.startsWith("s")).findAny();
        System.out.println(findAnyElement);

        Optional<String> findAnyElement2=list.stream().findAny();
        System.out.println(findAnyElement);


    }
}
