package Dsa.company;

import java.util.*;

//for Question-2


public class LinkedList_Practice_Questions_dsa2 {
    public static void main(String[] args) {
        /*
        //Question-1- find the index for value
        LinkedList<Integer> lisQ = new LinkedList<>();
        lisQ.add(1);
        lisQ.add(5);
        lisQ.add(7);
        lisQ.add(3);
        lisQ.add(8);
        lisQ.add(2);
        lisQ.add(3);

        System.out.println(lisQ);

        //Searching the value for ith index type-1
        int value = 7;
        for (int i = 0; i<lisQ.size(); i++){
            if (lisQ.get(i)==value){
                System.out.println(i);
            }
        }
        //Searching value for ith index type-1
        System.out.println(lisQ.indexOf(7));
         */

        //Question2-take userInput,if greater than 25 delete all greater than nodes
        LinkedList<Integer> lisLes = new LinkedList<>();
        LinkedList<Integer> lisGre = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i<=6){
            int input = sc.nextInt();
            if (input>50){
                System.out.println("Enter a Valid number between 1-50");
            }
            else if (input<=25) {
                lisLes.add(input);
            }
            else if (input>25) {
                lisGre.add(input);
            }
            i++;
        }
        lisLes.addAll(lisGre);
        System.out.println(lisLes);
        lisLes.removeAll(lisGre);
        System.out.println(lisLes);

    }
}
