package oop.exercice3;

import java.util.Objects;

public class Dog extends Animal {

    // Constructor — passes the name up to Animal
    public Dog(String name) {
        super(name);
    }

    // We override the makeSound method, so we can personalize it for this subclass
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }

    // We override the eat method, so we can personalize it for this subclass
    @Override
    public void eat() {
        System.out.println(getName() + " is eating meat.");
    }

    // Two Dogs are equal if they have the same name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Dog)) return false;
        Dog other = (Dog) obj;
        return Objects.equals(getName(), other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}