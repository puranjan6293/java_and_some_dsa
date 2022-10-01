// Associativity operators , class-9
package com.company;

public class Associativity_operators {
    public static void main(String[] args) {
        /*

        int a = 65*5-34/2;
        //Precedence-* is greater than / so, * first evaluate than / than -. and left to right associativity
        System.out.println(a);
        int b =65/5-34*2;
        //* and / associativity left to right

        System.out.println(b);

         */
        //Quick quiz
        int x =10;
        int y = 1;
        int a =2;
        int c =3;
//        int k = x*y/2; //left to right associativity
//        System.out.println(k);
        int s = (x*x)-(4*a*c)/(2*a); //here parenthesis used for correct result
        System.out.println(s);

    }
}
