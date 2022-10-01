//Throw and Throws in java, chapter 14
//Throw keyword is used to say for end this program
//Throws used for giving a warning or clue that it can throw a exception
//note - Static method don't have objects

package com.company;
//custom exception for example-2
class MyNegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius Cannot be Negative";
    }

    @Override
    public String getMessage() {
        return "Radius Cannot be Negative";
    }
}

public class Throw_and_Throws_chap14 {
    /*
    //Example-1
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    */

    public static double area(int r) throws MyNegativeRadiusException{
        if (r<0){
            throw new MyNegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }

    public static void main(String[] args) {
        /*
        //for example-1
        try {
            int c = divide(4,0);
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Exception");
        }
     */
        //for example -2
        try {
            double ar = area(-6);
            System.out.println(ar);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
