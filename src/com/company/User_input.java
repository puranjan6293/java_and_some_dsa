package com.company;
import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        System.out.println("Taking input from user");//write sout and press enter
        Scanner sc = new Scanner(System.in); //System.in mens taking keyboard as input
        System.out.println("Enter number 1");
//        int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2");
//        int b = sc.nextInt();
        float b = sc.nextFloat();
//        int sum = a+b;
        float sum = a+b;
        System.out.println("The sum is");
        System.out.println(sum);
//        String str = sc.next(); //it will help to print only one word
        String str = sc.nextLine(); //it will help to print the full sentence
        System.out.println(str);





    }
}
