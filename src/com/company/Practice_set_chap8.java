package com.company;

import java.awt.geom.Area;

/*
//Question-1
class Employei{
    //attributes
    int salary;
    String name;
    //making methods for salary
    public int GetSalary(){
        return salary;
    }
    //making methods for name
    public String GetName(){
        return name;
    }
    //making method for changing name
    public void SetName(String n){
        name = n;
    }

    }

 */
/*
//Question-2-Create a Cellphone class with methods ringing or vibrating
class Cellphone{
    public void ring(){
        System.out.println("Ringing......");
    }
    public void vibrate(){
        System.out.println("Vibrating......");
    }
}

 */
/*
//Question-3-create a square class, initialize side, calculate area
class Square{
    //initialize side
    int side;
    //method for calculating area
    public int GetArea(){
        return side*side;
    }
    //method for calculating perimeter
    public int GetPerimeter(){
        return side*4;
    }

}

 */
/*
//Question-4-create a class with some methods for finding area , perimeters
class Reactangle{
    int length;
    int breadth;
    public int GetArea(){
        return length*breadth;
    }
    public int GetPerimeter(){
        return 2*(length+breadth);
    }
}

 */
//Question-5-make a class tommyvicecity
class TummyVicity{
    public void rum(){
        System.out.println("Running...");
    }
    public void fire(){
        System.out.println("Firing...");
    }
    public void hit(){
        System.out.println("Hitting...");
    }
}




public class Practice_set_chap8 {
    public static void main(String[] args) {
        /*
        //for Question-1
        Employei puranjan = new Employei();

        puranjan.salary = 25000;
        puranjan.SetName("Puranjan Mallik");
        System.out.println(puranjan.GetName() + "\n" + puranjan.GetSalary());

         */
        /*
        //for Question-2
        Cellphone iPhone = new Cellphone();
        iPhone.ring();
        iPhone.vibrate();

         */
        /*
        //for Question-3
        Square sq = new Square();
        sq.side = 6;
        System.out.println("The Area is: "+sq.GetArea());
        System.out.println("The Perimeter is: "+sq.GetPerimeter());

         */
        /*
        //for Question-4
        Reactangle rl = new Reactangle();
        rl.length = 5;
        rl.breadth = 2;
        int ar = rl.GetArea();
        int pr = rl.GetPerimeter();
        System.out.println("The area is: "+ar);
        System.out.println("The Perimeter is :"+pr);

         */
        //For Question-5
        TummyVicity tm = new TummyVicity();
        tm.fire();
        tm.hit();
        tm.rum();





    }
}
