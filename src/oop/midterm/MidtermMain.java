package oop.midterm;

public class MidtermMain {
    public static void main(String[] args) {

        Animal a;
        Mammal m;
        Dolphin d;
        Platypus p;


        a = new Dolphin("Aquatic", "Orca");
        m = (Dolphin) a;
        System.out.println(m.getClass());
        System.out.println(m.getFamily());


    }



}
