//Interface in java - chap11
//interface means - a group of related methods with empty body
// implements keyword use for inherit interface

package com.company;
interface Bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle, HornBicycle{
   public void applyBreak(int decrement){
       System.out.println("Applying break");
   }
   public void speedUp(int increment){
       System.out.println("Applying speed Up");
   }
   public void blowHornK3g(){
       System.out.println("Bowing horn 3kg");
   }
   public void blowHornmhn(){
       System.out.println("blowing hormhn");
   }
}



public class Interface_chap11 {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBreak(1);
        // You can create properties in Interfaces
        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();

    }
}
