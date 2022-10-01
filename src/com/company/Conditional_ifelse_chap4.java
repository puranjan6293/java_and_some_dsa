//conditional ifelse
package com.company;
import java.util.Scanner;
public class Conditional_ifelse_chap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:\n");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Yes boy,\n\t You can drive");
        }
        else{ //here else is optional
            System.out.println("Sorry Boy,\n\t You cannot drive");
        }

    }

}
