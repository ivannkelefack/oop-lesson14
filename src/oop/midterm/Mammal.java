package oop.midterm;

/**
 *
 * This class is the subcalss of Animal, called Mammal
 *
 * @author Ivan Ateazeh Nkelefack
 * @version Midterm Section D
 *
 */

public class Mammal extends Animal {

    private String family;

    /**
     * This is the constructor with two parameter
     *
     * @param division represent the division of the Mammal
     * @param family represent the family of the Mammal
     */

    public Mammal(String division, String family){
        super(division);
        this.family = null;
    }

    /**
     * This is a method call getFamilly, it will return the family of the Mammal
     *
     * @return the family of the given Mammal
     */

    protected String getFamily(){
        return this.family;
    }
}
