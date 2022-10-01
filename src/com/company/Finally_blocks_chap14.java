//Finally blocks in java, chapter 14
//The finally block always executes when the try block exits
//NOTE - We can write finally with try in state of catch when it is needed

package com.company;

public class Finally_blocks_chap14 {
    public static int great(){
        int a =50;
        int b =0;
        try {
            int c = a/b;
            return c;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("end of this function...");
        }
        return -1; //-1 is treated as an error notation
    }
    public static void main(String[] args) {
       int k = great();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

        try{
            System.out.println(50/3);
        }
        finally {
            System.out.println("Yes this is finally");
        }

    }
}
