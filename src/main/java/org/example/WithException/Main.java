package org.example.WithException;

public class Main {

    public static void main(String[] args) {

        ArithmaticException i=(int c, int d)->{

            try{
                System.out.println(" division of two elements"+" "+ (c/d));
            }

            catch (ArithmeticException e){
                System.out.println("can't divide by zero");
            }
//            catch (Exception e){
//                System.out.println("Index Out Of bounds exception");
//            }
        };

        i.ExceptionChecking(10,0);


        display d=(a,b)->{
            float c=a+b;
            return c;
        };
        float result=d.m1(20,49.3f);
        System.out.println(result);
    }
}
