import oop.exercice1.Student;
import oop.exercice2.MathUtils;
import oop.exercice3.Animal;
import oop.exercice3.Cat;
import oop.exercice3.Dog;

import java.util.Scanner;

void main() {
    // Create the scanner
    Scanner scanner = new Scanner(System.in);


    // Menu — choose which exercise to run
    System.out.println("Choose an exercise:");
    System.out.println("1 = Exercise 1 - Student");
    System.out.println("2 = Exercise 2 - MathUtils");
    System.out.println("3 = Exercise 3 - Animals");
    System.out.print("Your choice: ");
    int exercise = scanner.nextInt();
    scanner.nextLine();

    if (exercise == 1) {
        runExercise1(scanner);
    } else if (exercise == 2) {
        runExercice2(scanner);
    } else if (exercise == 3) {
        runExercise3(scanner);
    } else {
        System.out.println("Invalid choice.");
    }

    scanner.close();
}

    // Exercice 1
    void runExercise1(Scanner scanner) {

        System.out.print("Enter name: ");
        String name = scanner.nextLine(); // We read the line, and make sure it compatible for the type (String)

        System.out.print("Enter age: ");
        int age = scanner.nextInt(); // We read the line, and make sure it compatible for the type (Integer)

        System.out.print("Enter average grade: ");
        double averageGrade = scanner.nextDouble();  // We read the line, and make sure it compatible for the type (Double)

        // Create a new object called student so it can print out
        // Example: Student: name = 'Ivan', age = 20, Average Grade = 81.0
        Student student = new Student(name, age, averageGrade);

        System.out.println(student);
    }

    // Exercice 2
    // We create a new object called math --> we are realizing here a sum, which is a math operation (the name doesn't really matter, it just to be coherent)
    void runExercice2(Scanner scanner) {
        MathUtils math = new MathUtils();

        // We allow the user to choose which method he wants to try
        System.out.println("Choose type:");
        System.out.println("1 = int");
        System.out.println("2 = double");
        System.out.println("3 = String");
        System.out.println("4 = three ints");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        // We initialize the different parameters
        int a = 0;
        int b = 0;
        int c = 0;
        double da = 0.0;
        double db = 0.0;
        String sa = "";
        String sb = "";

        // We use if, else statement so it can apply each method propreties
        if (choice == 1) {
            System.out.print("Enter first int: ");
            a = scanner.nextInt();
            System.out.print("Enter second int: ");
            b = scanner.nextInt();
            System.out.println("Result: " + math.sum(a, b));

        } else if (choice == 2) {
            System.out.print("Enter first double: ");
            da = scanner.nextDouble();
            System.out.print("Enter second double: ");
            db = scanner.nextDouble();
            System.out.println("Result: " + math.sum(da, db));

        } else if (choice == 3) {
            scanner.nextLine(); // We add this line because without, the code get confuse and will not take in account the first input
            System.out.print("Enter first String: ");
            sa = scanner.nextLine();
            System.out.print("Enter second String: ");
            sb = scanner.nextLine();
            System.out.println("Result: " + math.sum(sa, sb));

        } else if (choice == 4) {
            System.out.print("Enter first int: ");
            a = scanner.nextInt();
            System.out.print("Enter second int: ");
            b = scanner.nextInt();
            System.out.print("Enter third int: ");
            c = scanner.nextInt();
            System.out.println("Result: " + math.sum(a, b, c));

        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Exercice 3
    // We ask the input of the user, to know how many animals he wants
    void runExercise3(Scanner scanner) {

    System.out.println("How many animal ?");
    int numberOfAnimal = scanner.nextInt();
    System.out.println();


    // We create a new object of type array, to store the different animals
    Animal[] animals = new Animal[numberOfAnimal];

    // We loop through the array so we can choose between the two animals (Cat or Dog)
    for (int i = 0; i < animals.length; i++) {
        System.out.println("Animal " + (i + 1) + ": 1 for Dog, 2 for Cat");
        int choiceOfAnimal = scanner.nextInt();
        System.out.println();


        if (choiceOfAnimal == 1) {
            animals[i] = new Dog();
        } else {
            animals[i] = new Cat();
        }
    }

    // We loop through the array to display the different method of the Animal chosen
    for (int i = 0; i < animals.length; i++) {
        System.out.println();
        System.out.println("--- Animal " + (i + 1) + " ---");
        animals[i].makeSound();
        animals[i].eat();
        animals[i].sleep();
    }
    }


