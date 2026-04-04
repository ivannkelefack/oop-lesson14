package oop.midterm;

public class Dolphin extends Mammal {

    public Dolphin(String division, String family){
        super(division, family);
    }

    public String makeSound(){
        System.out.println("Make a sound from dolphin");
        return "";
    }
}
