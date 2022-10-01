//relational and logical operators
package com.company;

public class Relational_Logical {
    public static void main(String[] args) {
        // && logical and
        // || logical or
        // ! logical not

        /*
        System.out.println("for Logical AND");
        boolean a = true;
        boolean b = true;
        boolean c = false;
        if(a && b && c){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        //it will print true when all the booleans are true

         */

        /*
        System.out.println("for Logical OR");
        boolean a = false;
        boolean b = false;
//        boolean c = false;
        if(a || b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        //if one of boolean is true then it will return true

         */
        boolean a = true;
        boolean b = false;
        System.out.println("for Logical NOT");
        System.out.print("Not(a) is :");
        System.out.print(!a);
        System.out.print("Not(b) is :");
        System.out.print(!b);
        //it will just return the invert

    }
}
