//Object orienting programming, chapter-8
//DRY - do not repeat yourself
//class -  class having information to create a valid object
//Object  - is an instantiation of a class
/*
How to model a problem in OOPs-
Noun---->class---->employee
adjective--->Attributes--->name,age,salary
verb--->methods--->getSalary(), increment()
 */
/*
OOPs Terminology-
1.Abstraction - Hiding internal details
2.Encapsulation - The act of putting various components together.
-in java class we put different functionality in a class

3.Inheritance - The act of deriving new things from a existing things.
-implements DRY

4.Polymorphism - One entity many forms
 */

//Making our own class
package com.company;
//we can use one public class in one java file

//making a class
class Employee{
    //attributes
    int id;
    String name;
    int salary;
    //adding method in class
    public void printDetails(){
        System.out.println("id is: "+ id);
        System.out.println("name is: "+ name);
    }
    //making one more method for salary
    public int getSalary(){
        return salary;
    }
}
public class OOPS_chap8 {
    public static void main(String[] args) {
        //making object of our class
        Employee harry = new Employee();
        Employee john = new Employee();
        //Setting attributes for harry
        harry.id = 15;
        harry.name = "CodeWithHarry";
        harry.salary = 2000;
       //Setting attributes for harry
        john.id = 23;
        john.name = "John Sen";
        john.salary = 1000;
        //printing the attributes
//        System.out.println("id is: " +harry.id + " and name is:\n"+ harry.name);
        //printing by method
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);

    }
}
