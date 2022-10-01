// write a program to calculate the percentage of a student in cbse bord exam
package com.company;

import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in); //Taking input

        System.out.println("enter your mark in subject1:\n");
        float sub1 = mark.nextFloat();
        System.out.println("enter your mark in subject2:\n");
        float sub2 = mark.nextFloat();
        System.out.println("enter your mark in subject3:\n");
        float sub3 = mark.nextFloat();
        System.out.println("enter your mark in subject4:\n");
        float sub4 = mark.nextFloat();
        System.out.println("enter your mark in subject5:\n");
        float sub5 = mark.nextFloat();

        System.out.println("Enter the full mark of a subject:\n");
        int fullmark = mark.nextInt();
        int totalmark = fullmark*5;


        float sum = sub1+sub2+sub3+sub4+sub5;
        float percentage = (sum/totalmark)*100;
        System.out.println("Your total mark in percentage is:\n");
        System.out.println(percentage);



    }
}
