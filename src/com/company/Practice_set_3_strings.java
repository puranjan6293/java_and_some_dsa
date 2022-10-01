//Practice set 3

package com.company;
import java.util.Scanner;

import java.util.Locale;

public class Practice_set_3_strings {
    public static void main(String[] args) {
        /*
        //Question1- convert a string to lower case & upper case
        String st = "I am a Pro Programmer";
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());

         */
        /*
        //Question2-replace spaces with underscore
        String st = "Harry sir is my favorite";
        System.out.println(st.replace(' ','_'));

         */
        /*

        //Question3-fill a letter template
        System.out.println("Enter your name:\n");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String letter = "Dear <| |> Thanks a lot";
        String newletter = letter.replace("<| |>",name);
        System.out.println(newletter);

         */
        /*

        //Question3-to detect double and triple space in a program
        String st = "This string contain  double and triple spaces";
        System.out.println(st.indexOf("  "));
        System.out.println(st.indexOf("   ")); // output is -1 means in the above string there is no triple space

         */
        //Question5-Format the letter using escape sequence
        //letter2 - Dear Harry, This Java Course Is Nice. Thanks!
        String letter2 = "Dear Harry,\n\t This Java Course Is Nice.\n\t Thanks!";
        System.out.println(letter2);

    }
}
