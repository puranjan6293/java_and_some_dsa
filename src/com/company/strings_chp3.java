//chap3- Introduction to Strings

package com.company;
import java.util.Scanner;
public class strings_chp3 {
    public static void main(String[] args) {
        //String writing methods
        //Strings are immutable
        /*

//        String name = new String("Harry");
        String name ="Harry";
        System.out.print("The name is: "); //not making new line
        System.out.println(name);

         */

        /*

        //printf() function

        int a = 6;
        float b = 6.34f;
        System.out.printf("The value of a is %d and the value of b is %f", a,b);
        // printf() and format() both same
        System.out.format("The value of a is %d and the value of b is %f", a,b);

         */

        //Taking input String
        // first import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
//        String input = sc.next(); //it will help to print only the first word of a sentence
        String input = sc.nextLine(); // it will help to print the whole sentence
        System.out.println(input);



    }
}
