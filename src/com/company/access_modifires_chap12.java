//Access modifiers in java, chap12


package com.company;

import java.util.concurrent.Callable;

class C1{
    public int x =5;
    protected int y = 10;
    int z = 7;
    private int a = 1;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

}

public class access_modifires_chap12 {
    public static void main(String[] args) {
        C1 c = new C1();
        //c.meth1();//NOTE1 - We can use all access modifiers in a class

//        System.out.println(c.x);
//        System.out.println(c.y);
//        System.out.println(c.z);
//        System.out.println(c.a);//error //NOTE - We cannot use private access modifiers in same package


    }
}
