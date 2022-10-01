//Polymorphism in java, chap 11

package com.company;
interface Camera2{
    void takeSnap();
    void recordVideo();
    //Private Method
    private void greet(){
        System.out.println("I am private");
    }
    //default method
    default void record4KVideo(){
        greet(); //help to call private
        System.out.println("Recording in 4k...");
    }
}
interface Wifi2{
    String[] getNetworks();
    void connectingNetworks(String network);
}
class MyCellphone2 {
    void callNumber(int phoneNumber) {
        System.out.println("calling... " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellphone2 implements Camera2, Wifi2{
    public void takeSnap(){
        System.out.println("Taking a snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of netWorks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectingNetworks(String network){
        System.out.println("Connecting to "+network);
    }
}


public class Polymerphism_chap11 {
    public static void main(String[] args) {
        Camera2 cam1 = new MySmartPhone2();// This is a smartphone but, use it as a camera
        // cam1.getNetworks(); --> Not allowed
        // cam1.sampleMeth(); --> Not allowed
        cam1.record4KVideo();

        //let's use all method
        MySmartPhone2 msp2 = new MySmartPhone2();
        msp2.pickCall();
        msp2.connectingNetworks("Harry");
        msp2.takeSnap();


    }
}
