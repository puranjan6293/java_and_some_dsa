//chapter 6 practice set - Arrays

package com.company;
import javax.swing.*;
import java.util.Scanner;

public class Practice_set_chap6 {
    public static void main(String[] args) {
        /*
        //Question-1-create an arrays of 5 floats and calculate their sum
        float[]Question1 = {2.5f,3.5f,4.5f};
        float sum = 0;
        for (float element: Question1){
            sum = sum+element;
        }
        System.out.println(sum);

         */
        /*
        //Question-2-print whether a given integer is present in Arrays or not
        Scanner sc = new Scanner(System.in);
        int []question2 = {2,3,4,5};
        System.out.println("Enter a element:\n");
        int given = sc.nextInt();
//        int given = 2;
        boolean isInArray = false;
        for (int element: question2){
            if (given==element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present!");
        }
        else {
            System.out.println("The value is not preset!");
        }

         */
        /*
        //Question-3-Calculate the average marks of a Arrays , contains student marks
        float[]marks = {25f,56f,67f,89f,90f};
        float sum = 0;
        for (float elements: marks ){
            sum = (elements+sum);
        }
        System.out.println("The average mrk is: "+ sum/marks.length);

         */
        /*
        //Question-4-make two 2x3 matrix and add them
        int[][]matrix1 = {{1,2,3}, {4,5,6}};
        int[][]matrix2 = {{3,2,1}, {6,5,4}};
        int[][]sum = {{0,0,0}, {0,0,0}};
        for (int i = 0; i< matrix1.length; i++)//row number of times
        {
            for (int j = 0; j< matrix1[i].length; j++)//column number of times
            {
                sum[i][j] = matrix1[i][j]+matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(" ");
        }

         */
        /*
        //Question-5-write program to reverse an Array
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

         */
        /*
        //Question-5.1-Reverse an array
        int[]array = {2,3,4,5,6,7,8};
        int length = array.length;
        int n = Math.floorDiv(length, 2);
        int temp;
        for (int i=0; i<n; i++){
            temp = array[i];
            array[i] = array[length-i-1];
            array[length-i-1] = temp;
        }
        for (int element: array){
            System.out.print(element + " ");
        }

         */
        /*
        //Question-6-find the maximum element in an Array
        int[]array = {2,3,4,7,8,-120,9,110};
        int max = Integer.MIN_VALUE;
        for (int element: array){
            if (element>max){
                max = element;
            }
        }
        System.out.println("The maximum element in this Array is: "+ max);

         */
        /*
        //Question-7- Find the minimum value of a Array
        int[]array = {-11,-23,25,56,0,-45};
        int min = Integer.MAX_VALUE;
        for (int element: array){
            if (element<min){
                min = element;
            }
        }
        System.out.println("The minimum value is: "+ min);

         */
        //Question-8- check A array is sorted or not
        int[]array = {3,4,5,6,7,8,9,10};
        boolean isSorted = true;
        for (int i = 0; i<array.length-1; i++){
            if (array[i] > array[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }





    }

}
