//Interface examples and default, chapter11

package com.company;
interface Camera{
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
interface Wifi{
    String[] getNetworks();
    void connectingNetworks(String network);
}
class MyCellphone {
    void callNumber(int phoneNumber) {
        System.out.println("calling... " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellphone implements Camera, Wifi{
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

public class Interface_examples_chap11 {
    public static void main(String[] args) {
        MySmartPhone msp = new MySmartPhone();
        //running default method
        msp.record4KVideo();
        // ms.greet(); --> Throws an error!
        //for getting networks
        String[] ar = msp.getNetworks();
        for (String elements: ar){
            System.out.println(elements);
        }
        //for connecting networks
        msp.connectingNetworks("Harry");
    }
}
