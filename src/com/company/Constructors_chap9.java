//constructors in java
//constructor is a member function use to initialise an object while creating it
package com.company;
class MyMainEmployee{
    private int id;
    private String name;
    /*
    //making constructor
    public MyMainEmployee(){
        //how to identify constructor- ans - same name with class
        id = 45;
        name = "Puranjan Mallik";
    }

     */
    //Passing arguments with constructor
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;

    }
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


public class Constructors_chap9 {
    public static void main(String[] args) {
        /*
        //without giving attributes to constructor
        MyMainEmployee mne = new MyMainEmployee();
        //using constructor
        System.out.println(mne.GetId());
        System.out.println(mne.GetName());

         */
        //Giving attributes to constructor
        MyMainEmployee mne = new MyMainEmployee("Puranjan Mallik",120);
        System.out.println(mne.GetName());
        System.out.println(mne.GetId());

    }
}
