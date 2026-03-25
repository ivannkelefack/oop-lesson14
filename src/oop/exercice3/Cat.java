package oop.exercice3;

public class Cat extends Animal{

    // We override the makeSound method, so we can personalize it for this subclass
    @Override
    public void makeSound() {
        System.out.println("The cat is making a meow sound");
    }

    // We override the eat method, so we can personalize it for this subclass
    @Override
    public void eat(){
        System.out.println("The cat is eating fish");
    }
}
