//chap4 Practice question- conditional and switch case
package com.company;
import javax.swing.*;
import java.util.Scanner;

public class Practice_set4_conditional_switch {
    public static void main(String[] args) {

        /*
        //Question-1-Greater than or not
        Scanner sc = new Scanner(System.in);
        System.out.println("input a random number:\n");
        int input = sc.nextInt();
        if(input>10){
            System.out.println("I am greater than 10");
        }
        else {
            System.out.println("I am smaller than 10");
        }

         */
        /*
        //Question-2-pass or fail

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark in subject1:\n");
        int subj1 = sc.nextInt();
        System.out.println("Enter the mark of subj2:\n");
        int subj2 = sc.nextInt();
        System.out.println("Enter the mark of subj3:\n");
        int subj3 = sc.nextInt();

        float agrage = (subj1+subj2+subj3)/3.0f;

        if(agrage>=40 && subj1>=33 && subj2>=33 && subj3>=33){
            System.out.println("You are pass");
        }
        else {
            System.out.println("you are fail");
        }

         */
        /*
        //Question3-calculate the income tax of a employ's salary
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income:\n");
        int income = sc.nextInt();
        float tax1 = income*0.05f;
        float tax2 = income*0.2f;
        float tax3 = income*0.3f;

        if(income>=250000 && income<=500000){
            System.out.println("Your income is greater-than 2.5L," +
                    "so you will going to pay 5% tax " +
                    "Your tax amount is: "+tax1);
        }
        else if (income>500000 && income<=1000000) {
            System.out.println("Your income is greater-than 5L," +
                    "so you will going to pay 20% tax " +
                    "Your tax amount is: "+tax2);

        }
        else if (income>1000000) {
            System.out.println("Your income is greater-than 10L," +
                    "so you will going to pay 30% tax " +
                    "Your tax amount is: "+tax3);

        }
        else {
            System.out.println("You don't have to give tax");
        }

         */
        /*
        //Question4-find the day of a weak by number
        String a = "Sunday";
        String b = "Monday";
        String c = "Tuesday";
        String d = "Wednesday";
        String e = "Thursday";
        String f = "Friday";
        String g = "Saturday";
        System.out.println("A full weak contain 7 days " +
                "Enter a Number between 1-7:\n");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1 -> System.out.println("its " + a);
            case 2 -> System.out.println("its " + b);
            case 3 -> System.out.println("its " + c);
            case 4 -> System.out.println("its " + d);
            case 5 -> System.out.println("its " + e);
            case 6 -> System.out.println("its " + f);
            case 7 -> System.out.println("its " + g);
            default -> System.out.println("Enter a Valid Number");
        }

         */
        /*
        //Question4-Entered year is a leap year or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year:\n");
        int input = sc.nextInt();
        int divisibleTest = input%4; //% gives the reminder
        if(divisibleTest==0){
            System.out.println("The entered year " + input +"\nIs a leap Year");
        }
        else {
            System.out.println("The entered year " +input +"\nIs Not a Leap Year");
        }

         */
        //Question5-Which type of website
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Website URL:\n");
        String input = sc.nextLine();
        if (input.endsWith(".com")){
            System.out.println("This is a Commercial Website");
        }
        else if (input.endsWith(".org")) {
            System.out.println("This is a organisation Website");

        }
        else if (input.endsWith(".in")) {
            System.out.println("This is a Indian Website");

        }


    }
}
