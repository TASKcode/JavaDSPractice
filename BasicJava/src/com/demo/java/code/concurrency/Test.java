package com.demo.java.code.concurrency;

public class Test extends Thread {

    /*public void run() {
        System.out.println("Hack");
    }
    public void run(String s) {
        System.out.println("Build");
    }
    public static void main(String[] args) {
        new Test().start();
    }*/

    /*    static int a=20;
        int b=10;
        public static void main(String args[])
        {
            Test t=new Test();
            t.a=30;
            t.b=40;
            System.out.println(t.a);
            System.out.println(t.b);
        }*/
/*public static void main(String args[])
{
    char chars[] = {'a', 'b', 'c'};
    String s = new String(chars);
    String s1 = "abcd";
    int len1 = s1.length();
    int len2 = s.length();
    System.out.println(len1 + " " + len2);
}*/
    public static void main(String args[]) throws Exception {

        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.print("There is an error");
        } finally {
            System.out.println("There is no error");
        }
    }
}
