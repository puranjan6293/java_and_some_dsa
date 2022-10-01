//Multi dimensional Arrays-chap6
//means- Arrays of Arrays

package com.company;

public class Multidimentional_Arrays_chap6 {
    public static void main(String[] args) {


        //2D- Arrays-and displaying the Arrays
        int [][]flats = new int[2][3];
        //adding elements to the 3D Array
        flats[0][0] = 100;
        flats[0][1] = 200;
        flats[0][2] = 300;
        flats[1][0] = 10;
        flats[1][1] = 20;
        flats[1][2] = 30;

        for (int i = 0;i<flats.length; i++){
            for (int j = 0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }


        /*
        //3D Arrays
        String [][][]NameWorks = new String[3][2][2];
        //Adding element to the #D Arrays
        NameWorks[0][0][0] = "Harry";
        NameWorks[0][0][1] = "Rohan";
        NameWorks[0][1][0] = "king";
        NameWorks[0][1][1] = "Queen";
        NameWorks[1][0][0] = "Harry2";
        NameWorks[1][0][1] = "Rohan2";
        NameWorks[1][1][0] = "king2";
        NameWorks[1][1][1] = "Queen2";
        NameWorks[2][0][0] = "Harry3";
        NameWorks[2][0][1] = "Rohan3";
        NameWorks[2][1][0] = "king3";
        NameWorks[2][1][1] = "Queen3";

        System.out.println(NameWorks[2][0][1]);

         */


    }
}
