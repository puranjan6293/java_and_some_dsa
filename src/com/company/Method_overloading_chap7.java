//Method Overloading in java- chapter7
//means - in one class multiple methods are present with same name but different parameters

package com.company;

public class Method_overloading_chap7 {
    /*
    //When we don't want to return anything then we can use - this void return type
    static void tellJoke(){
        System.out.println("You are a Joker");
        int x =98;
    }

     */
    /*
    //case-1-change in integer
    static void change(int a){
        int x = 98;
    }
     */
    /*
    //case-2- change in Arrays
    static void change2(int[]array){
        array[0] = 98;
    }

     */
    //Method overloading part
    static void foo(){
        System.out.println("I am a good boy");
    }

    static void foo(int a){
        System.out.println("Harri sir is best"  + "Nop");
    }

    public static void main(String[] args) {
        //tellJoke();
        /*
        //for case-1
        int x =45;
        change(x);
        System.out.println("The value of x after running change is: "+x);

         */
        /*
        //for case-2
        int []marks = {23,45,46,67,98,94};
        change2(marks);
        System.out.println("The value after change is: "+ marks[0]);
        //here we pass the reference not the object so, it will give the output with change

         */
        //Method Overloading- multiple methods same name but different works or parameter
        foo();
        foo(8);
        //arguments are Actual
        //note-we can change parameters for overloading, but we can't do overloading by changing return


    }
}
