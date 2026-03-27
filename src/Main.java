import oop.exercice1.Student;
import oop.exercice2.MathUtils;
import oop.exercice3.Animal;
import oop.exercice3.Cat;
import oop.exercice3.Dog;
import oop.exercice4.Circle;
import oop.exercice4.Drawable;
import oop.exercice4.Rectangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

void main() {
    // Create the scanner
    Scanner scanner = new Scanner(System.in);

    // Menu — choose which exercise to run
    System.out.println("Choose an exercise:");
    System.out.println("1 = Exercise 1 - Student");
    System.out.println("2 = Exercise 2 - MathUtils");
    System.out.println("3 = Exercise 3 - Animals");
    System.out.println("4 = Exercise 4 - Drawable");
    System.out.println("5 = Exercise 5 - Sort + Equals");
    System.out.print("Your choice: ");
    int exercise = scanner.nextInt();
    scanner.nextLine();

    if (exercise == 1) {
        runExercise1(scanner);
    } else if (exercise == 2) {
        runExercise2(scanner);
    } else if (exercise == 3) {
        runExercise3(scanner);
    } else if (exercise == 4) {
        runExercice4(scanner);
    } else if (exercise == 5) {
        runExercise5(scanner);
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
void runExercise2(Scanner scanner) {
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

        // We ask for the name — needed since Animal now requires one
        System.out.print("Enter name: ");
        scanner.nextLine(); // flush leftover newline from nextInt()
        String animalName = scanner.nextLine();
        System.out.println();

        if (choiceOfAnimal == 1) {
            animals[i] = new Dog(animalName);
        } else {
            animals[i] = new Cat(animalName);
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

// Exercise 4
void runExercice4(Scanner scanner) {

    // We create a list of type Drawable to store the different shapes
    List<Drawable> shapes = new ArrayList<>();

    System.out.print("How many shapes? ");
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
        System.out.println("Shape " + (i + 1) + ": 1 for Circle, 2 for Rectangle");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();
            shapes.add(new Circle(radius));

        } else if (choice == 2) {
            System.out.print("Enter width: ");
            double width = scanner.nextDouble();
            System.out.print("Enter height: ");
            double height = scanner.nextDouble();
            shapes.add(new Rectangle(width, height));

        } else {
            System.out.println("Invalid choice, skipping.");
        }
    }

    // We loop through the list to display draw() and calculateArea() on each shape
    System.out.println();
    for (Drawable shape : shapes) {
        shape.draw();
        System.out.println("Area: " + shape.calculateArea());
        System.out.println();
    }
}

// Exercise 5
void runExercise5(Scanner scanner) {

    // We create an ArrayList to store the animals — flexible size unlike array
    ArrayList<Animal> animals = new ArrayList<>();

    System.out.print("How many animals? ");
    int n = scanner.nextInt();

    // We loop through so the user can choose and name each animal
    for (int i = 0; i < n; i++) {
        System.out.println("Animal " + (i + 1) + ": 1 for Dog, 2 for Cat");
        int choice = scanner.nextInt();
        scanner.nextLine(); // flush leftover newline from nextInt()

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        if (choice == 1) {
            animals.add(new Dog(name));
        } else if (choice == 2) {
            animals.add(new Cat(name));
        } else {
            System.out.println("Invalid choice, skipping.");
        }
    }

    // Sort alphabetically by name — works because Animal implements Comparable
    Collections.sort(animals);

    // Print sorted list using the overridden toString()
    System.out.println("\n--- Sorted animals ---");
    for (Animal animal : animals) {
        System.out.println(animal);
    }

    // Check equality between animals of the same type already in the list
    System.out.println("\n--- Equality check ---");
    for (int i = 0; i < animals.size(); i++) {
        for (int j = i + 1; j < animals.size(); j++) {
            Animal a1 = animals.get(i);
            Animal a2 = animals.get(j);

            // Only compare animals of the same type
            if (a1.getClass() == a2.getClass()) {
                if (a1.equals(a2)) {
                    System.out.println(a1.getName() + " and " + a2.getName() + " are equal — same type, same name!");
                } else {
                    System.out.println(a1.getName() + " and " + a2.getName() + " are not equal — same type, different name.");
                }
            }
        }
    }
}