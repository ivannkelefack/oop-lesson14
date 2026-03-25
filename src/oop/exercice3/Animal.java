package oop.exercice3;

// We implement an abstract class
public abstract class Animal {

    // makeSound is an abstract method
    public abstract void makeSound();

    public void eat(){
        System.out.println("The animal is eating.");
    }

    public void sleep(){
        System.out.println("The animal is sleeping.");

    }
}
