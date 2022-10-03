package com.company;

import java.util.Scanner;

public class Two_D_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row, colum numbers\n");
        int row = sc.nextInt();
        int colum = sc.nextInt();

        int [][]arr = new int[row][colum];
        System.out.println("Enters the values\n");
        //input
        for (int i=0;i<row;i++){
            for (int j=0;j<colum;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output in matrix: ");
        //output
        for (int i=0;i<row;i++){
            for (int j=0;j<colum;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
