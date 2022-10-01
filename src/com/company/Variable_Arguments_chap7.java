//Variable Arguments in java - chapter7
//instate of using multiple methods for one type of function we can use( ...arr)

package com.company;

public class Variable_Arguments_chap7 {
    /*
    //case-1-no need any compulsory argument
    static int sum(int ...arr) {
        //Available as int[]arr
        int result = 0;
        for (int a: arr){
//            result = result+a;
            result +=a;
        }
        return result;
    }

     */
    //case-2-here need at least one any compulsory arguments
    static int sum(int x, int...arr){
        int results = 0;
        for (int elements: arr){
            results +=elements;
        }
        return results;
    }

    public static void main(String[] args) {
        /*
        //for case-1
        System.out.println("the sum of 2,3,5 is: "+sum(2,3,5));
        System.out.println(sum()); //here if we don't give any argument than also it will print

         */
        //for case-2
        System.out.println("The sum of given numbers is: "+ sum(5,4,5,6,7,8,9));
        //see - here the first value is compulsory we have to give


    }
}
