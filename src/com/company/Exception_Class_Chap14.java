//Exception class in java, chap 14

package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am get message()";
    }
}
public class Exception_Class_Chap14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<10){
            try {
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace(); //used for knowing where and why is the error
            }
//            System.out.println("Finished");
        }
//        System.out.println("Yes Finished");

    }
}
