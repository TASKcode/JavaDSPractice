package com.demo.java.code.play;

public class Bulb {

    static int toggleBulb(int range) {
        int[] bulbArray = new int[range];
        int count = 0;

        for (int i = 0; i < range; i++) {
            bulbArray[i] = 1;
        }

        for (int i = 2; i < range; i++) {
            for (int j = i - 1; j < range; j = j + i) {


                if (bulbArray[j] == 1) {
                    bulbArray[j] = 0;
                } else {
                    bulbArray[j] = 1;
                }

            }
        }

        for (int i = 0; i < range; i++) {
            count += bulbArray[i];
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(Bulb.toggleBulb(4));
    }


}
