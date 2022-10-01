//Break and continue statement in java with loop and if conditions

package com.company;

public class Break_continue_chap5 {
    public static void main(String[] args) {
        /*
        //using break with for loop
        System.out.println("Starting for loop:");
        for (int i = 0; i<5; i++) {
            System.out.println(i);
            System.out.println("Java is nice");

            if (i==2){
                System.out.println("Ending the loop");
                break;
            }
        }

         */
        /*
        //using break with while loop
        System.out.println("Starting the loop:");
        int i=0;
        while (i<5){
            System.out.println(i);
            System.out.println("java is great");
            if (i==3){
                System.out.println("Loop ends here");
                break;
            }
            i++;
        }

         */
        //continue statement
        System.out.println("Starting for loop:");
        for (int i = 0; i<5; i++) {

            if (i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is nice");
        }


    }
}
