//Recursion in java , chapter-7
//Recursion - A function in java can call itself, such calling of function is called as Recursion

package com.company;

import java.util.Scanner;

public class Recursion_chap7 {
    /*
    //Finding factorial by using Recursion method
    static int factorial(int n){
        //note : factorial of 0 and 1 is = 1
        //factorial of n is = n*(n-1*...)
        //we can write factorial of n = n* factorial(n-1)
        if (n==1 || n==0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }

    }

     */
    //Fibonacci number by using Recursion
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

    public static void main(String[] args) {
        /*
        //factorial by Recursion method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value for return factorial:\n");
        int input = sc.nextInt();
        System.out.println("The factorial of "+input +" is :");
        System.out.println(factorial(input));

         */
        //for finding fibonacci
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input for Fibonacci: \n");
        int input = sc.nextInt();
        for (int i=0;i<input;i++){
            System.out.println(fibonacci(i));
        }
    }
}
