//This and super keywords in java , chapter-10
package com.company;
class EkClass{
    int a;
    //getter
    public int getA() {
        return a;
    }
    //constructor
    EkClass(int a){
        this.a = a;
    }

    public int returnone(){
        return 1;
    }
}
//inherited class
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
    System.out.println("I am a constructor");
    }
}
public class This_and_super_chap10 {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(e.getA());
    }
}
