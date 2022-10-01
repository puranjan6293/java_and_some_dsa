//Method overriding in java, chapter10
//means -
package com.company;
class A{
    public int a;
    public int meth1(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am meth2 of class A");
    }
}
class B extends A{
    @Override //A notation
    public void meth2(){
        System.out.println("I am meth2 of class B ");
    }
    public void meth3(){
        System.out.println("I am meth3 of class B ");
    }
}

public class Method_overriding_chap10 {
    public static void main(String[] args) {
        A cls = new A();
        cls.meth2();
        B clb =new B();
        clb.meth2();
        //Before adding meth2 in class B, output is-
//        I am meth2 of class A
//        I am meth2 of class B
        //Note - in class B , if we add meth2 method than it will return own method
        //after adding meth2 in class B, output is -
//        I am meth2 of class A
//        I am meth2 of class B

    }
}
