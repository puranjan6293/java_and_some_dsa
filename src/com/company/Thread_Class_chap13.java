//Thread class in java, chap13
//Type - 1
package com.company;
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<50){
            System.out.println("My Thread1 is running");
            System.out.println("I am Happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<50){
            System.out.println("My Thread2 is running");
            System.out.println("I am Sad");
            i++;
        }
    }
}
public class Thread_Class_chap13 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        //start method is used to call for threading
        t1.start();
        t2.start();

    }
}
