//Abstract class and Abstract method
//Abstract_method means - Declared without an implementation
//jiska object nehi ban sakta woh abstract class hai
//Abstract_class means - A class where it contains Abstract methods

package com.company;
abstract class Parent2{
    //making constructor
    Parent2(){
        System.out.println("I am a constructor of Base2");
    }
    public void sayHello(){
        System.out.println("Hello guys");
    }
    abstract public void Greet(); //here we're doing abstract method so we have to write abstract in parent class
    abstract public void Greet2();

}
class Child2 extends Parent2{
    @Override
    public void Greet(){
        System.out.println("Good morning guys");
    }
    @Override
    public void Greet2(){
        System.out.println("Good Afternoon guys");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am child3 abstract class");
    }
}
public class Abstarct_class_and_method_chap11 {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error
        Child2 c = new Child2();
        //Child3 c3 = new Child3(); -- error
    }
}
