//inheritance in java, chapter 10
//extends keyword ued for inheritance

package com.company;
//making the base class
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in bass & setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a good boy");
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance_chap10 {
    public static void main(String[] args) {
        //using base class
//        Base b = new Base();
        //using inherited class
        Derived d = new Derived();
        d.setX(5);
        System.out.println(d.getX());

    }
}
