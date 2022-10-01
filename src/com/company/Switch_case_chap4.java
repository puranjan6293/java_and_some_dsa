//switch case - yt18
package com.company;
import java.util.Scanner;


public class Switch_case_chap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:\n");
        int age = sc.nextInt();

        /*
//instate of using multiple if else statement we can use if elseif statement
        if(age>56){
            System.out.println("You are Experienced");
        }
        else if(age>46){
            System.out.println("You are semi-Experienced");
        }
        else if (age>36) {
            System.out.println("You are semi-semi-Experienced");

        }
        else {
            System.out.println("You are not Experienced");

        }

         */

        //Let's use switch case
        // here break; used to stop execution
        //we can use switch with int,char,string

        switch (age){
            case 18:
                System.out.println("Now you are adult");
                break;
            case 23:
                System.out.println("Now you can get a job");
                break;
            case 60:
                System.out.println("You are going to become a old man");
                break;
            default:
                System.out.println("enjoy your life");
        }

    }
}



