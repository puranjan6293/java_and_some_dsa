//Practice set , chapter 11

package com.company;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimals{
    void eat();
    void sleep();
}
class Humans extends Monkey implements BasicAnimals{
    void speak(){
        System.out.println("Hello sir");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }
}

public class Practice_set_chap11 {
    public static void main(String[] args) {
        // Q1 + Q2
        FountainPen pen = new FountainPen();
        pen.changeNib();
        // Q3
        Humans harry = new Humans();
        harry.sleep();
        harry.eat();
        harry.speak();
        // Q5
        Monkey m1 = new Humans();
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method
        BasicAnimals lovish = new Humans();
        // lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();

    }
}
