//Dynamic method dispatch, chapter - 10
package com.company;
class Phone{
    public void showTime(){
        System.out.println("Time is 8AM");
    }
    public void on(){
        System.out.println("Turning phone on");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Plying music");
    }
    public void on(){
        System.out.println("Turning Smartphone on");
    }
}

public class Dynamic_method_Dispatch_chap10 {
    public static void main(String[] args) {
        /*
        //normal method dispatch
        Phone obj = new Phone();
        obj.showTime();
        SmartPhone smp = new SmartPhone();
        obj.showTime();
         */
        //Dynamic method dispatch
        //note - The reference of super class is can be equal to object of subclass
        //here - obj is reference of super class & new SmartPhone is object of subclass
        Phone obj = new SmartPhone(); //possible
       // SmartPhone obj2 = new Phone(); //not possible

        obj.on(); //SmartPhone ka method run hoga
        //This is called Dynamic method dispatch
        obj.showTime(); //Smartphone ka time milega
//        obj.music(); //Not allowed


    }
}
