//chap5 practice set
package com.company;

public class Practice_set_chap5 {
    public static void main(String[] args) {
        /*
        //Question-1-Print the following pattern
        for (int i = 5; i>0; i--){
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

         */
        /*
        //Question-2-print sum first n even numbers
        int num = 10;
        int n = 1;
        while (n<=num){
            System.out.println(2*n);
            n++;
        }
        System.out.println("Summation is: "+ num*(num+1));

         */
        /*
        //Question-3-print multiplication table of a given number
        int n =4;
        for (int i = 1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",n ,i ,i*n);
        }

         */
        /*
        //Question-4- print multiplication table of a given number
        int n =4;
        for (int i = 10; i>=1; i--){
            System.out.printf("%d X %d = %d\n", n, i, i*n);
        }

         */
        /*
        //Question-5-print the factorial of a given number using while loop
        int n = 4; //here given number is initialisation
        int i = 1;
        int factorial = 1;
        while (i<=n){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);

         */
        /*
        //Question-6-print the factorial of a given number using for loop
        int n = 5;
        int initial = 1;
        int factorial = 1;
        for (int i = initial; i<=n; i++){
            factorial *= i;
        }
        System.out.println(factorial);

         */
        /*
        //Question-7-print descending order * by while loop
        int num = 5;
        int initial = 1;
        while (num>=1){
            for (int b= 0; b<num; b++){
                System.out.print("*");
            }
            System.out.println("\n");
            num--;
        }

         */
        /*
        //Question-8-A program can be done with any type of loop
        //ans- True

         */
        /*
        //Question-9-calculate the sum of the numbers occurring on the multiplication table of 8
        int n = 8;
        int i = 1;
        int sum = 0;
        while (i<=10){
            int k = i*n;
            System.out.printf("%d X %d = %d\n", n, i, k);
            sum += k;

            i++;
        }
        System.out.println("The sum is: " + sum);

         */
        /*
        //Question-10-A do-while loop is executed how many time
        //ans- At least ones

         */
        //Question-11- print sum of n even numbers using for loop

        int n = 10;
        int sum = 0;
        for (int i = 1; i<=10; i++){
            System.out.println(2*i);
            sum += 2*i;
        }
        System.out.println("The summation is: "+sum);








    }
}
