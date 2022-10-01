//Practice set , chapter - 10

package com.company;
//Question - 1 - create a class circle and inherit a cylinder class from it
class CircleNew{
    public int radius;
    //making constructors
    CircleNew(){
        System.out.println("I am non param of circle");
    }
    CircleNew(int r) {
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends CircleNew{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class Practice_Set_chap10 {
    public static void main(String[] args) {
//        CircleNew objC = new CircleNew(12);
        Cylinder1 obj = new Cylinder1(12, 4);
        System.out.println(obj.volume());
        System.out.println(obj.area());
    }
}
