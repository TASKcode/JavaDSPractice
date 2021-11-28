package com.demo.java.code.base;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {

        Person p = new Student();
        p.talk();

    }
}


class Person {

    public void talk() {
        System.out.println("I am a person");
    }

}

class Student extends Person {

    public void talk() {
        System.out.println("I am a Student");
    }
}