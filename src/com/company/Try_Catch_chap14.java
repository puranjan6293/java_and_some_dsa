//Try & Catch in java, chapter 14

package com.company;

import java.util.Scanner;

public class Try_Catch_chap14 {
    public static void main(String[] args) {
        System.out.println("Using Try & Catch\n");
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        try {
            System.out.println("7 devide by entered integer is: "+ 7/k);
        }
        catch (Exception e){
            System.out.println("Error reason:\n" + e);
        }
    }
}
