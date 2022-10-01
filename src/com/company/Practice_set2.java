//Practice set2
package com.company;
import java.util.Scanner; //used for taking user defined number


public class Practice_set2 {
    public static void main(String[] args) {
        /*
        //Question1-What is the result of the following expression
        float a = 7/4*9/2; //associativity - first /, than *, than /
        float b = 7/4.0f*9/2.0f; //associativity - first /, than *, than /
        System.out.println(a);
        System.out.println(b);//correct answer

         */

        /*
        //Question2-write a program to encrypt a grade by adding 8 and decrypt to get the correct grade

        char grade = 'B';
        //Encrypting
        grade = (char) (grade+8); //typecasting to char
        System.out.println(grade);
        //Decrypting
        grade = (char) (grade-8);
        System.out.println(grade);

         */

        /*
//        Question3-entered number is greater than 8 or not
        //import Scanner
        System.out.println("Enter any random number:\n");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input>8);

         */

        /*

        //Question4-write a following expression for v^2-u^2/2as
        int v = 8;
        int u = 3;
        int a = 4;
        int s = 1;
//        int ans = (v*v-u*u)/(2*a*s);
        float ans = (float) ((v*v-u*u)/(2*a*s)); //typecast to float
        System.out.println(ans);

         */

//        Question5-find the value of the following question
        int x = 7;
        int a = (int) (7.49/7+35/7);
        float b = (float) (7.49/7+35/7);
        System.out.println(a);
        System.out.println(b);






    }
}
