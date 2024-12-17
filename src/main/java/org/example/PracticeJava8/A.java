package org.example.PracticeJava8;

interface Interface1 {
    default void m1(){
        System.out.println("Interface");
    }
}
class B {
     void m1567(){
        System.out.println("Interface");
    }
}
public class A extends B implements Interface1{

    public static void main(String[] args) {


        A a = new A();
        a.m1();

    }

}
