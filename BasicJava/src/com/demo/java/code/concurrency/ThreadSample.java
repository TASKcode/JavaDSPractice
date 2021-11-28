package com.demo.java.code.concurrency;

public class ThreadSample extends Thread {
    /* int count = 0;
     public void run(){
         System.out.println("run");
         synchronized (this) {
             for(int i =0; i < 50 ; i++){
                 count = count + i;
             }
             notify();
         }
     }
 }

  class SampleTest{

     public static void main(String argv[]) {
         ThreadSample a = new ThreadSample();
         a.start();
         synchronized (a) {
             System.out.println("waiting");
             try{
                 a.wait();
             }catch(InterruptedException e){

             }
             System.out.println(a.count);

         }
     }*/
    public static void main(String[] args) {
        Thread thread = new Thread(new Task2());
        thread.start();
    }

    private static class Task2 implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello from new thread");
        }
    }
}