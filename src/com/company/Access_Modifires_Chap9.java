//Access modifiers , getters & setters in Java - Chapter- 9
//means - Access modifiers specify that whether a property or method is accessible
//Types - Private, Public, default, Protected

package com.company;
/*

class MyEmployee{
    private int id;
    private String name;
    //Making Getters and setters
    public String GetName(){
        return name;
    }
    public void SetName(String n){
        this.name = n;
    }
    public int GetId(){
        return id;
    }
    public void SetId(int m){
        this.id = m;
    }
}

 */
//Exercise- make getter & setter and solve the area problem of a circle
class Circle{
    private float radius;
    private float area;
    private float peimeter;
    public void setRadius(float a){
        this.radius = a;
    }
    public void setAreaCircle(float b){
        if (b == 22*radius*radius/7){
            this.area = b;
        }
        else {
            System.out.println("WARNING! wrong area as per the radius");
        }
    }
    public void setPerimeterCircle(float c){
        if (c == 2*22*radius/7){
            this.peimeter = c;
        }
        else {
            System.out.println("WARNING! wrong perimeter as per the radius");
        }
    }
     public float getAreaCircle(){
        return area;
    }
    public float getPerimeterCircle(){
        return peimeter;
    }
    public float getRadiusCircle(){
        return radius;
    }
}

public class Access_Modifires_Chap9 {
    public static void main(String[] args) {
        /*
        MyEmployee ME = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        ME.SetName("Puranjan Mallik");
        ME.SetId(35);

        System.out.println(ME.GetName());
        System.out.println(ME.GetId());

         */
        //For Exercise
        Circle cle = new Circle();
        cle.setRadius(5);
        cle.setAreaCircle(78.57143f);
        System.out.println(cle.getAreaCircle());
//        System.out.println(22*5*5/7f);


    }
}
