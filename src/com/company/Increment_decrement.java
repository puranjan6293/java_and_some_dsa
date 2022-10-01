//Data Type of Expressions & Increment/Decrement Operators - class 10

        package com.company;

public class Increment_decrement {
    public static void main(String[] args) {
         /* byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b); */

        // increment and decrement operators
        int i =55;
        // int b = i++; // first b is assigned i (56) then i is incremented
        int j = 67;
        int c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println(i);
        System.out.println(i++); //first use i than increment
        System.out.println(i);
        System.out.println(++i); //first increment i than use
        System.out.println(i);

    }
}
