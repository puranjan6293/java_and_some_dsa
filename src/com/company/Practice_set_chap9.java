//Practice set chapter9

package com.company;
/*
//Question1-make a cylinder and set and get radius and volume and surface area
class Cylinder {
    public float length;
    public float height;
    public float surfaceCyl;
    public float volumeCyl;

    void setLengthCylinder(float length){
        this.length = length;
    }
    void setHeightCylinder(float height){
        this.height = height;
    }
    float getLengthCylinder(){
        return length;
    }
    float getHeightCylinder(){
        return height;
    }
    //Making constructor
    public Cylinder(float cylHeight, float cylLength){
        length = cylLength;
        height = cylHeight;
        surfaceCyl = (float) (2* Math.PI* length * length + 2*Math.PI*length*height);
        volumeCyl = (float) (Math.PI * length * length * height);
    }
//    float surfaceAreaCylinder(){
//        return (float) (2* Math.PI* length * length + 2*Math.PI*length*height);
//    }
//    float volumeCylinder(){
//        return (float) (Math.PI * length * length * height);
//    }
}
 */
//Question-4-overloading a constructor
class ReactangleNew{
    private int length;
    private int breadth;

    public ReactangleNew(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public ReactangleNew(){
        this.length = 4;
        this.breadth = 5;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class Practice_set_chap9 {
    public static void main(String[] args) {
        /*
        //for Question1-3
        Cylinder cl = new Cylinder(10,5);
        System.out.println("Length is: "+cl.length);
        System.out.println("height is: "+cl.height);
        System.out.println("volume is: "+cl.surfaceCyl);
        System.out.println("Area is: "+cl.volumeCyl);

         */
        //for Question-4
//        ReactangleNew rn = new ReactangleNew();
        ReactangleNew rn = new ReactangleNew(12,56);//method overloading
        System.out.println(rn.getBreadth());
        System.out.println(rn.getLength());


    }
}
