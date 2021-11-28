package com.demo.java.code.base;

public class Passs {
    public static void main(String[] args) {
        Passs p = new Passs();
        p.start();
    }

    void start() {
        String s1 = "Sleep";
        String s2 = fix(s1);
        System.out.println(s1 + " " + s2);
    }

    String fix(String s1) {
        s1 = s1 + "stream";
        System.out.println(s1 + " ");
        return "steem";
    }
}
