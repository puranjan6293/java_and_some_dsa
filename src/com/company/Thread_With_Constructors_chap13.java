//Thread class with constructors , chapter 13

package com.company;
/*
//thread string constructor
class myThrS extends Thread{
    public myThrS(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 34;
        System.out.println("Thank You");
    }
}
 */
//thread (Runnable r,string) constructor
class ThreadRunC implements Runnable{
    @Override
    public void run() {
        System.out.println("Now thread is running.....");
    }
}

public class Thread_With_Constructors_chap13 {
    public static void main(String[] args) {
        /*
        //for thread string constructor
        myThrS t1 = new myThrS("Puranjan");
        myThrS t2 = new myThrS("Mallik");
        t1.start();
        t2.start();
        System.out.println("Thread id is: "+t1.getId());
        System.out.println("Thread name is: "+t1.getName());
        System.out.println("Thread id is: "+t2.getId());
        System.out.println("Thread name is: "+t2.getName());

         */
        //for thread runnable r constructor
        // creating an object of the class MyThread2
        Runnable r1 = new ThreadRunC();
        // creating an object of the class Thread using Thread(Runnable r, String name)
        Thread th1 = new Thread(r1,"My new thread");
        // the start() method moves the thread to the active state
        th1.start();
        // getting the thread name by invoking the getName() method
        System.out.println(th1.getName());


    }
}
