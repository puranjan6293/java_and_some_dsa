//Thread priorities in java, chapter 13
package com.company;
class MyThrPrio extends Thread{
    public MyThrPrio(String name){
        super(name);
    }
    public void run(){
        int i = 34;

        while(true){
//            System.out.println("I am a thread");
            System.out.println("Thank you: " + this.getName());
        }

    }
}
public class Thread_Priorities_chap13 {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThrPrio t1 = new MyThrPrio("Harry1");
        MyThrPrio t2 = new MyThrPrio("Harry2");
        MyThrPrio t3 = new MyThrPrio("Harry3");
        MyThrPrio t4 = new MyThrPrio("Harry4");
        MyThrPrio t5 = new MyThrPrio("Harry5 (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
