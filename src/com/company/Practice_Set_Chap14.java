//Practice set chapter 14
package com.company;

import java.util.Scanner;

//for Question - 4 and 5
class MyCustomException extends Exception{
    @Override
    public String toString() {
        return "Max retries Reached..!";
    }

    @Override
    public String getMessage() {
        return "Max retries Reached..!";
    }
}

public class Practice_Set_Chap14 {
    //for Question-5
    public static void trialsError() throws MyCustomException{
        int[]arr = {2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (true && i<5){
            try {
                System.out.println("Enter the value of index\n");
                index = sc.nextInt();
                System.out.println("The value at index "+index+" is "+arr[index]);
            }
            catch (Exception e){
                System.out.println("invalid index..");
                i++;
            }
        }
        if (i>=5){
            try {
                throw new MyCustomException();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws MyCustomException {
        /*
        //Question -1- Demonstrate Syntax, Logical and runtime error
// Syntax Error - int a = 7
        int age = 78;
        int year_born = 2000-78; // Logical error
//        System.out.println(6/0);
         */
        /*
        //Question - 2 - custom exceptions
        int x =50;
        int y =0;
        try {
            int z = x/y;
        }
        catch (ArithmeticException e){
            System.out.println("HaHa...");
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe...");
        }
         */
        /*
        //Question - 3 -Array accessing,

        int[]arr = {2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (true && i<5){
            try {
                System.out.println("Enter the value of index\n");
                index = sc.nextInt();
                System.out.println("The value at index "+index+" is "+arr[index]);
            }
            catch (Exception e){
                System.out.println("invalid index..");
                i++;
            }
        }
        if (i>=5){
            System.out.println("Error..!");
        }
         */
        /*
        //Question -4- Throw a custom Exception for Question 3
        int[]arr = {2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (true && i<5){
            try {
                System.out.println("Enter the value of index\n");
                index = sc.nextInt();
                System.out.println("The value at index "+index+" is "+arr[index]);
            }
            catch (Exception e){
                System.out.println("invalid index..");
                i++;
            }
        }
        if (i>=5){
            try {
                throw new MyCustomException();
            }catch (Exception e){
                System.out.println(e);
            }
        }
         */
        //For Question -5
        trialsError();
    }
}
