//Thread methods in java, chapter 13
//Thread Methods:
//
//        start() – Starts the thread.
//        getState() – It returns the state of the thread.
//        getName() – It returns the name of the thread.
//        getPriority() – It returns the priority of the thread.
//        sleep() – Stop the thread for the specified time.
//        Join() – Stop the current thread until the called thread gets terminated.
//        isAlive() – Check if the thread is alive.

package com.company;
class MyThreadMeth1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<100){
            System.out.println("My Thread method 1 is running...");
            i++;
        }
    }
}
class MyThreadMeth2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<100){
            System.out.println("My Thread method 2 is running...");
            i++;
        }
    }
}
public class Thread_Methods_chap13 {
    public static void main(String[] args) {
        MyThreadMeth1 mtm1 = new MyThreadMeth1();
        MyThreadMeth2 mtm2 = new MyThreadMeth2();
        mtm1.start();

        /*
        //join() method
        if we want to finish the running of mtm1 and then start mtm2
        than we have to use join() method inside a try/catch for it
         */

        try {
            mtm1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        mtm2.start();

    }
}
