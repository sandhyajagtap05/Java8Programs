package org.example.methodReferenceWithParametherisedConstructor;


public class ParameterisedConstructor {

    public static void main(String[] args) {
        MyFunctionalInterface i=Student::new;

        Student student=i.create(1,"sandhya","pune");

        System.out.println(student);

    }

}
