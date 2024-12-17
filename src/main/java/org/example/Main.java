package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        LambdaExpression l=()->{
            System.out.println("using lambda expression");
        };
     l.run();


     LambdaExpression2 l2=(int a,int b)->{
        int  c=a+b;
         System.out.println(c);

       return c;
     };

     int cc=l2.m1(3,6);
        System.out.println(cc);
    }
}