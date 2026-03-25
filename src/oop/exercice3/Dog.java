package oop.exercice3;

public class Dog extends Animal{

    // We override the makeSound method, so we can personalize it for this subclass
    @Override
    public void makeSound() {
        System.out.println("the dog is making a woof sound");
    }

    // We override the eat method, so we can personalize it for this subclass
    @Override
    public void eat(){
        System.out.println("The dog is eating meat");
    }
}
