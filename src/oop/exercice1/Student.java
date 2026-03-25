package oop.exercice1;

public class Student {

    //  We define the variable of a visibility of private
    private String name;
    private int age;
    private double averageGrade;

    // We initialize the default constructor
    public Student(){
    }

    // We initialize the full constructor
    public Student(String name, int age, double averageGrade){
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    // We set up the Getter for name, age and averageGrade
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getAverageGrade(){

        return averageGrade;
    }

    // We set up the Setter for name, age and averageGrade
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAverageGrade(double averageGrade){
        this.averageGrade = averageGrade;
    }

    //We set up the toString method
    @Override
    public String toString() {
        return "Student: name = '" + name + "', age = " + age + ", Average Grade = " + averageGrade + ".";
    }
}
