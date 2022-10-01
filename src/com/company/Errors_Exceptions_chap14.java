//Errors and Exceptions in java, chap14
//3Types -
//1.Syntax error (Error due to users mistake)
//2.logical error(it will run, but it will print wrong output)
//3.Runtime error(it will run but when it will not get the required data from user then it will show error)
//Runtime error is also called exceptions

package com.company;

import java.util.Scanner;

public class Errors_Exceptions_chap14 {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 0 // Error: no semicolon!
        // b = 8; // Error: b not declared!

        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }

        // RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);

    }
}
