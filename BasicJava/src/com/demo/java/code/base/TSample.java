package com.demo.java.code.base;

import java.util.TreeSet;

public class TSample {
   /* public static void main(String[] args) {
        {
            int var1 = 5;
            int var2 = 5;
            if ((var2 = 1) == var1)
                System.out.print(var2);
            else
                System.out.print(++var2);
        }
    }*/

    /*    static String value = "testify";
        static int value1 = 25;

        static {
            value1 = 50;
            System.out.println(value);
            System.out.println(value1);
        }

        public static void main(String args[]){
        }*/
    public static void main(String args[]) throws Exception {
        TreeSet<StringBuffer> t = new TreeSet<StringBuffer>();
        t.add(new StringBuffer("H"));
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("C"));
        t.add(new StringBuffer("K"));
        System.out.println(t);
    }

}
