//Java Thread by Runnable interface, chapter 13

package com.company;
class myThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i<500){
            System.out.println("I am thread 1 , Happy...");
            i++;
        }
    }
}
class myThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i<500){
            System.out.println("I am thread 2 , Sad...");
            i++;
        }
    }
}

public class Thread_by_Runnable_interface_chap13 {
    public static void main(String[] args) {
        myThreadRunnable1 bullet1 = new myThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        myThreadRunnable2 bullet2 = new myThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
