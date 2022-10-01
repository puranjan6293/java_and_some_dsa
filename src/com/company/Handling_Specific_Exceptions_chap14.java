//Handling specific exceptions in java, chapter -14

package com.company;

import java.util.Scanner;

public class Handling_Specific_Exceptions_chap14 {
    public static void main(String[] args) {
        int[] marks = {10,20,30};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index\n");
        int ind = sc.nextInt();
        System.out.println("enter the number you wants to divide with array index\n");
        int num = sc.nextInt();
        try {
            System.out.println("The value at array index is: "+marks[ind]);
            System.out.println("The value of array-value/number is: "+marks[ind]/num);
        }
//        catch (Exception e){
//            System.out.println("Error..!\n Reason is: \n"+e);
//        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}
