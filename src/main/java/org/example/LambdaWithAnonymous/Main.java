package org.example.LambdaWithAnonymous;

public class Main {

//    @Override
//    public void m1() {
//
//    }

    public static void main(String[] args) {
        addingTwoNo a=new addingTwoNo() {
            @Override
            public void m1() {
                System.out.println("hello");
            }
        };

        a.m1();
    }
}
