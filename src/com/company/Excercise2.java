// Rock, paper, scissor game

package com.company;
import java.util.Scanner;
import java.util.Random; //for random number generate

public class Excercise2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock, paper, scissor game!");
        Scanner sc = new  Scanner(System.in);


        System.out.println("Rock = 0 ");
        System.out.println("paper  = 1 ");
        System.out.println("scissor = 2 ");
        System.out.println("please Enter your choice here:");
        byte number = sc.nextByte();




        Random rnum  = new Random();

        int  random  = rnum.nextInt(3);


        //rock = 0
        //paper = 1
        //scissor = 2


        switch (random) {
            case 0 -> System.out.println("pc select rock");
            case 1 -> System.out.println("pc select paper");
            case 2 -> System.out.println("pc select scissor");
            default -> {
            }
        }

        switch (number) {
            case 0 -> System.out.println("you select rock");
            case 1 -> System.out.println("you select paper");
            case 2 -> System.out.println("you select scissor");
            default -> {
            }
        }


        if(random == number )
        {
            System.out.println("this is tie ");
        }

        else if (random == 2 && number ==1 ) {
            System.out.println("you lost");

        }
        else if (random == 1 && number == 0) {
            System.out.println("you lost");

        }

        else if( random == 0 && number == 2)
        {
            System.out.println("you lost");

        }


        else if (random == 1 && number == 2) {
            System.out.println("you win ");

        }

        else if (random == 0 && number == 1) {
            System.out.println("you win ");


        }

        else if (random == 2 && number == 0) {
            System.out.println("you won");

        }
        else {
            System.out.println("Please select a valid number");
        }

    }
}
