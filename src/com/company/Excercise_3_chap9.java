//Guess the number game

package com.company;
import java.util.Random;
import java.util.Scanner;

//first we make a class
class Game{
    public int number;
    public int inputNumber;
    public int numberOfGuess = 0;
    //shortcut to generate getters and setters
    //write - public in getNumberOfGuess - than alt+INSERT

    public int getNumberOfGuess() {
        return numberOfGuess;
    }

    public void setNumberOfGuess(int numberOfGuess) {
        this.numberOfGuess = numberOfGuess;
    }

    //making a constructor
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    //making user input function
    void takeUserInput(){
        System.out.println("Guess the number\n");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    //making a boolean return function
    boolean isCorrect(){
        numberOfGuess++;
        if (inputNumber==number){
            System.out.format("Your gussed number %d is correct\n You guessed it in %d attempts",number,numberOfGuess);
            return true;
        }
        else if (inputNumber<number)
        {
            System.out.println("Too less.....");
        }
        else if (inputNumber>number)
        {
            System.out.println("Too greater...");
        }
        return false;
    }



}


public class Excercise_3_chap9 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrect();
        }
    }
}
