//Chapter 7 Practice set
package com.company;

import jdk.dynalink.beans.BeansLinker;

import java.util.Scanner;

public class Practice_set_chap7 {
    /*
    //Question-1-make method for multiplication table of a number n
    static void multiplication(int n){
        for (int i = 1; i<=10; i++){
            System.out.format("%d X %d = %d\n",n ,i ,n*i);
        }
    }

     */
    /*
    //Question-2-write a method to print the pattern
    static void pattern(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

     */
    /*
    //Question-3-write a recursive method to calculate the first n natural numbers sum
    static int sum_of(int n){
        if (n==1){
            return 1;
        }
        else {
            return n+sum_of(n-1);
        }
    }

     */
    /*
    //Question-4-write a method to print decreasing order of stars
    static void stars(int n){
        for (int i = n; i>-1; i--){
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

     */
    /*
    //Question-5-Write a program to print the nth tern of fibonacci series
    static int fibonacci(int n){
        if (n==0){
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

     */
    /*
    //Question-6-find the average of a set of numbers
    static float set(float[]average){
        float sum =0;
        for (float elements: average){
            sum = elements+sum;
        }
        return sum/average.length;
    }

     */
    /*
    //Question-7-print decreasing order star pattern by recursion
    // function to print the 'n-th' row
    // of the pattern recursively
    static void stars_row(int n){
        //base condition
        if (n<1)
            return;
        // print the remaining stars
        // of the n-th row recursively
        System.out.print("* ");
        stars_row(n-1);

    }
    static void stars_pattern(int n){
        //base condition
        if (n<1)
            return;
        //print the stars of the n-th row
        stars_row(n);
        //move to the next line
        System.out.println();
        // print stars of the
        // remaining rows recursively
        stars_pattern(n-1);

    }

     */
    /*
    //Question-8-printing increasing order of stars by recursion
    static void stars_row(int n){
        if (n<1)
            return;
        System.out.print("* ");
        stars_row(n-1);
    }
    static void stars_pattern(int n,int i){
        if (n<1)
            return;
        stars_row(i);
        System.out.println();
        // recursively calling pattern()
        stars_pattern(n - 1, i + 1);

    }

     */
    /*
    //Question-9-method to convert celsius temperature in to fahrenheit
    static float convert(float n){
        float fahrenheit = (n*9/5)+32;
        return fahrenheit;
    }

     */
    //Question-10-calculate the sum of nth number by iterative method
    static void sum_of(int n){
        if (n==0)
            return;
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum +=i;
        }
        System.out.println("The sum of n number is: "+sum);
    }

    public static void main(String[] args) {
        /*
        //for Question-1
        System.out.println("The Multiplication table is:\n");
        multiplication(5);

         */
        /*
        //for Question-2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input:\n");
        int input = sc.nextInt();
        pattern(input);

         */
        /*
        //for Question-3
        System.out.println("The sum of 5 natural numbers is: "+ sum_of(5));

         */
        /*
        //for Question-4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers of stars you want to print: \n");
        int input = sc.nextInt();
        stars(input);

         */
        /*
        //for Question-5
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:\n");
        int input = sc.nextInt();
        System.out.println("The "+input+"th"+"fibonacci is: "+fibonacci(input));

         */
        /*
        //for Question-6
        float[]numbers = {2,3,4,5};
        System.out.println("The average is: "+set(numbers));

         */
        /*
        //for Question-7
        int n =5;
        stars_pattern(n);

         */
        /*
        //for Question-8
        int n =5;
        int i =1;
        stars_pattern(n,i);

         */
        /*
        //for Question-9
        float temp = 35.50f;
        System.out.println("Temperature in fahrenheit is: "+ convert(temp));

         */
        //for Question-10
        int x = 6;
        sum_of(x);


    }
}
