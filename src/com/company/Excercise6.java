/*
       Exercise 6: You have to create a custom calculator with following operations:
       1. + -> Addition
       2. - -> Subtraction
       3. * -> Multiplication
       4. / -> Division
       which throws the following exceptions:
       1. Invalid input Exception ex: 8 & 9
       2. Cannot divide by 0 Exception
       3. Max Input Exception if any of the inputs is greater than 100000
       4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
        */

package com.company;

import java.util.Scanner;

//all the custom exceptions
class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot add 8 & 9";
    }

    @Override
    public String getMessage() {
        return "I am a get message";
    }
}
class CannotDivideByException extends Exception{
    @Override
    public String toString() {
        return "Cannot Divide by Zero..!";
    }

    @Override
    public String getMessage() {
        return "I am a getMessage";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Max input Exception..Input cannot be greater than 10000";
    }

    @Override
    public String getMessage() {
        return "I am a getMessage";
    }
}
class MaxMultiplicationException extends Exception{
    @Override
    public String toString() {
        return "Cannot multiply the Input greater than 7000";
    }

    @Override
    public String getMessage() {
        return "I am a getMessage";
    }
}
//custom calculator class
class MyCustomCalculator{
    //Addition
    double add(double a,double b) throws InvalidInputException,MaxInputException{
        if (a==8 || b==9){
            throw new InvalidInputException();
        }
        if (a>10000 || b>10000){
            throw new MaxInputException();
        }
        return a + b;
    }
    //Subtraction
    double sub(double a, double b) throws MaxInputException{
        if (a>10000 || b>10000){
            throw new MaxInputException();
        }
        return a - b;
    }
    //Multiplication
    double multiply(double a, double b) throws MaxInputException,MaxMultiplicationException{
        if (a>10000 || b>10000){
            throw  new MaxInputException();
        }
        if (a>7000 || b>7000){
            throw new MaxMultiplicationException();
        }
        return a * b;
    }
    //divide
    double divide(double a, double b) throws MaxInputException,CannotDivideByException{
        if (a>10000 || b>10000){
            throw new MaxInputException();
        }
        if (b==0){
            throw new CannotDivideByException();
        }
        return a / b;
    }
}

public class Excercise6 {
    public static void main(String[] args)throws MaxInputException,MaxMultiplicationException,CannotDivideByException,InvalidInputException {
        MyCustomCalculator MC = new MyCustomCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:\n");
        double x = sc.nextDouble();
        System.out.println("Enter the value of b:\n");
        double y = sc.nextDouble();
//        System.out.println(MC.add(x,y));
//        System.out.println(MC.sub(x,y));
//        System.out.println(MC.multiply(x,y));
        System.out.println(MC.divide(x,y));




    }
}
