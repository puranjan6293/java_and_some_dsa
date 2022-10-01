//Methods in array- chapter7
//Method is a function return inside a class
package com.company;

import java.util.Scanner;

public class Methods_in_Array_chap7 {
    //making a logic method
    /*
    //Method-1
    static int logic(int x, int y){
        int z;
        if (x>y){
            z = (x+y)*5;
        }
        else {
            z = x+y;
        }
        return z;
    }

     */
    //method-2- calling with object
    int logic(int x, int y){
        int z;
        if (x>y){
            z = (x+y)*5;
        }
        else {
            z = x+y;
        }
        return z;
    }
    public static void main(String[] args) {
        /*
        //using logic method-1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input a: \n");
        int a = sc.nextInt();
        System.out.println("Enter input b: \n");
        int b = sc.nextInt();
        int c;
        c = logic(a, b);
        System.out.println(c);

         */
        //using logic method-2-calling by making object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input a: \n");
        int a = sc.nextInt();
        System.out.println("Enter input b: \n");
        int b = sc.nextInt();
        int c;
        Methods_in_Array_chap7 object = new Methods_in_Array_chap7(); //here Methods_in_Array_chap7 is name of the class
        c = object.logic(a, b);
        System.out.println(c);

    }
}
