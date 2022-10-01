//constructors in inheritance

package com.company;
class Parent{
    public int n;
    //parent class constructor
    Parent(){
        System.out.println("I am a parent class constructor");
    }
    Parent(int a){
        System.out.println("I am a overloaded constructor of parent class "+ a);
    }
}
class Inherited extends Parent{
    //making inherited class constructor
    Inherited(){
       // super(0); //for calling the overloading constructor first from base class
        System.out.println("I am a inherited class constructor");
    }
    Inherited(int a, int b){
        super(a);
        System.out.println("I am a overloaded constructor of inherited class with value b as: "+b);
    }
}
//making a child class constructor
class Child extends Inherited{
    Child(){
        System.out.println("I am child of Inherited class constructor");
    }
    Child(int a, int b, int c){
        super(a,b);
        System.out.println("I am a overloaded constructor of child class with value c as: "+c);
    }
}
public class constructors_in_inheritance_chap10 {
    public static void main(String[] args) {
//        Parent p = new Inherited();
//        Inherited i = new Inherited();
        //NOTE - fist parent class constructor will call then inherited class
        //if we want to call the overloaded constructor first than we have to use super keyword

//        Inherited in = new Inherited(15,50);
        //by child class constructor
        Child ch = new Child(18,23,56);

    }
}
