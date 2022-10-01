//Arrays length and Arrays with loop

package com.company;

public class Arrays_with_loop_chap6 {
    public static void main(String[] args) {
        /*

        //Arrays length and printing all elements of a Array using for loop
        int []mark = {23,34,45,56,67};
//        System.out.println(mark.length);
        for (int i = 0; i<mark.length; i++){
            System.out.println(mark[i]);
        }

         */
        /*
        //Quick quiz- print a Arrays all element in reverse order
        int[]marks = {10,20,30,40,50,60};
        int l = marks.length;
        for (int i = l-1; i>=0; i--){
            System.out.println(marks[i]);
        }

         */
        //for-each loop
        //simple syntax to print the all elements of an Array
        int []marks = {10,20,30,40,50,60};
        for (int element: marks){
            System.out.println(element);
        }
    }
}
