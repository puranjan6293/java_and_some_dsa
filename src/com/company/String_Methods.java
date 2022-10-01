// String methods

package com.company;

public class String_Methods {
    public static void main(String[] args) {
        /*
        String name = "Harry";
//        System.out.println(name);

        // Lets use some methods

//        int value = name.length();
//        System.out.println(value);//it will print the length of the string

         */

        //  lowercase and uppercase
//        String Lstring = name.toLowerCase(); //it will convert the string in lower case
//        System.out.println(Lstring);
//        String upstring = name.toUpperCase(); //it will convert the string in upper case
//        System.out.println(upstring);

        //Trim method
        /*

       String nonTrimString = "   Harry   ";
        System.out.println(nonTrimString);
       String trimed_string = nonTrimString.trim();
        System.out.println(trimed_string);

         */

        /*

        //name.subString

        String nam = "kedar";
//        System.out.println(nam.substring(2)); //it will print afterwith 2nd position of string

        //substring method for start and end
        System.out.println(nam.substring(1,4)); //first index is included but last index is excluded
        //output is- eda

         */

        /*

        //.replace method
        String name = "Harry";
        System.out.println(name.replace('r','p')); //it replaces all character of r with p
        System.out.println(name.replace("rry","ppy")); //it replaces the string rry in to ppy
        System.out.println(name.replace("r","ppy")); //it replaces all r in to ppy

         */

        /*

        //starts with method
        String name = "Harry";
        System.out.println(name.startsWith("Har"));
        //output-true
        System.out.println(name.endsWith("rri"));
        //output-false

         */

        /*

        //.charAt method
        String name = "Harry";
        System.out.println(name.charAt(1));

         */

        /*

        //indexOf method-starting character
        String name = "Harry";
        System.out.println(name.indexOf("ry")); //ry starts from index no 3 in "Harry"
        System.out.println(name.indexOf("ry",2)); //its start wondering from index no 2 in "Harry"
        System.out.println(name.indexOf("ry",22332)); //its return -1, because its doesn't found

         */

        /*

        //LastIndex method
        String name = "Harryrry";
        System.out.println(name.lastIndexOf("rry")); //its return the last occurrence
        System.out.println(name.lastIndexOf("rry",4));

         */
        /*

        //Equals method
        String name = "Harry";
        System.out.println(name.equals("Harry"));
        //output-true
        System.out.println(name.equals("harry"));
        //output-false

         */

        /*

        //EqualIgnoreCase method
        String name = "Harry";
        System.out.println(name.equalsIgnoreCase("harry")); //it will ignore the lower case and upper case
        //output-true
        System.out.println(name.equalsIgnoreCase("harrrrrry"));

        //output-false

         */
        //escape Sequence characters - character after back slas
        System.out.println("I am escape sequence\" double coat");
        //output-I am escape sequence" double coat
        System.out.println("I am escape sequence\\ back slas");
        //output-I am escape sequence\ back slas
        System.out.println("I am escape sequence\t back slas");
        //output-I am escape sequence	 back slas





    }
}
