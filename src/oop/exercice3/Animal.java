package oop.exercice3;

public abstract class Animal implements Comparable<Animal> {

    // We add name so we can sort and compare animals
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Abstract method — each subclass must implement it
    public abstract void makeSound();

    // Concrete methods — unchanged from exercise 3
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Sorts alphabetically by name
    @Override
    public int compareTo(Animal other) {
        return this.name.compareTo(other.name);
    }

    // Prints cleanly — Dog{name='Rex'} or Cat{name='Mimi'}
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "'}";
    }
}