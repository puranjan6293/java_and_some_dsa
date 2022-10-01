//Arrays chap6
//Arrays is a collection of similar type of data
//accessing elements in an Array is faster
package com.company;

public class Arrays_chap6 {
    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        */
        // There are three main ways to create an array in Java
        /*
        // 1. Declaration and memory allocation
         int[]marks = new int[5];//allocating memory

        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;
        marks[2] = 100; //we can change or overwrite any value in Arrays
        System.out.println(marks[2]);

         */
        /*

        //2.type2
        int[]marks; //Declaration
        marks = new int [5]; //memory allocation
        //initialisation
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;
        marks[2] = 100; //we can change or overwrite any value in Arrays
        System.out.println(marks[2]);

         */
        //type3- Declaration ,memory allocation, initialisation together
        int[]marks = {20,30,40,50,60};
        System.out.println(marks[2]);

    }
}
