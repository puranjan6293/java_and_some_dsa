//Practice set , Chapter 13

package com.company;
/*
//Question -1 - print good morning and good evening continuously using thread
//Question -2 - Add a sleep method in welcome thread
//Question -3 - GetPriority and SetPriority
class GoodMorningThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i<100; i++){
            System.out.println("GoodMorning....!");}
    }
}
class WelcomeThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i<100; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Welcome....!");
        }
    }
}
 */
//Question -4 - How to get state of a Thread
class ThreadNewSta extends Thread{
    @Override
    public void run() {
        System.out.println("Hello Guys....");
        Thread.State state = Thread.currentThread().getState();
        System.out.println(Thread.currentThread().getName());
        System.out.println("state = "+state);
    }
}

public class Practice_Set_Chap13 {
    public static void main(String[] args) {
        /*
        //Question 1-3
        GoodMorningThread gmt = new GoodMorningThread();
        WelcomeThread wt = new WelcomeThread();

        //Note - If we not setPriority than the default priority is 5 for each
        gmt.setPriority(3);
        wt.setPriority(7);
        System.out.println(gmt.getPriority());
        System.out.println(wt.getPriority());
        gmt.start();
        wt.start();
         */
        //for Question -4
        ThreadNewSta tns = new ThreadNewSta();
        tns.start();

    }
}
