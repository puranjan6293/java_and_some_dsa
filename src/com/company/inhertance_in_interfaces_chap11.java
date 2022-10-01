//inheritance in interfaces, chap11

package com.company;
interface sampleInterface{
    void math1();
    void math2();
}
//inheriting interface
interface childSampleInterface{
    void math3();
    void math4();
}
//implementing interfaces
class MySampleClas{
    public void math1(){
        System.out.println("math1");
    }
    public void math2(){
        System.out.println("math2");
    }
    public void math3(){
        System.out.println("math3");
    }
    public void math4(){
        System.out.println("math4");
    }
}

public class inhertance_in_interfaces_chap11 {
    public static void main(String[] args) {
        MySampleClas msp = new MySampleClas();
        msp.math1();
        msp.math2();
        msp.math3();
        msp.math4();

    }
}
