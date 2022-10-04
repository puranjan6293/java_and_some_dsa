package Dsa.company;

public class Recursion_java {
    /*
    //What is recursion, print numbers from 5 to 1
    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }

    //print numbers from 1 to 5
    public static void printNumbers(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumbers(n+1);

    }

    //print sum of first n natural numbers
    public static void printSum(int i, int n, int sum){
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
    }


    //Print factorial of a number n
    public static int factorial(int n){
        //note - here we return the factorial value so, no need to store it in the main functions parameter
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);

    }

    //print fibonacci series till nth term
    public static void fibonacciS(int a, int b, int n){
        if(n==0){
            return;
        }
        int c =a+b;
        System.out.println(c);
        fibonacciS(b,c,n-1);
    }

     */
    //fibonacci series technique2
    public static int fibonacciNthTerm(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return fibonacciNthTerm(n-1)+fibonacciNthTerm(n-2);
        }
    }



    public static void main(String[] args) {
//        printNumbers(5);
//        printNumbers(1);
//        printSum(1,5,0);
//        System.out.println(factorial(5));

        //for fibonacci series
        /*
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        fibonacciS(a,b,n-2);
         */

        //for fibonacci part2
        int n=7;
        for (int i=0;i<n;i++){
            System.out.println(fibonacciNthTerm(i));
        }

    }
}
