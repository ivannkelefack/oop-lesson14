import oop.exercice1.Student;
import oop.exercice2.MathUtils;
import oop.exercice2.NonIntegerException;
import oop.exercice3.Animal;
import oop.exercice3.Cat;
import oop.exercice3.Dog;
import oop.exercice4.Circle;
import oop.exercice4.Drawable;
import oop.exercice4.Rectangle;
import oop.exercice6.TextProcessor;
import oop.exercice7.Inventory;
import oop.exercice7.Item;
import oop.exercice8.SavingsAccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create the scanner
        Scanner scanner = new Scanner(System.in);

        // Menu — choose which exercise to run
        System.out.println("Choose an exercise:");
        System.out.println("1 = Exercise 1 - Student");
        System.out.println("2 = Exercise 2 - MathUtils");
        System.out.println("3 = Exercise 3 - Animals");
        System.out.println("4 = Exercise 4 - Drawable");
        System.out.println("5 = Exercise 5 - Sort + Equals");
        System.out.println("6 = Exercise 6 - Text Processor");
        System.out.println("7 = Exercise 7 - Inventory");
        System.out.println("8 = Exercise 8 - Bank System");
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
        } else if (exercise == 6) {
            runExercise6();
        } else if (exercise == 7) {
            runExercise7(scanner);
        } else if (exercise == 8) {
            runExercise8(scanner);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    // Exercice 1
    static void runExercise1(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter average grade: ");
        double averageGrade = scanner.nextDouble();

        // Create a new object called student so it can print out
        Student student = new Student(name, age, averageGrade);
        System.out.println(student);
    }

    // Exercice 2
    static void runExercise2(Scanner scanner) {
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
        int interA;
        int interB;
        int interC = 0;
        double doubleA = 0.0;
        double doubleB = 0.0;
        String stringA = "";
        String stringB = "";

        // We use if, else statement so it can apply each method properties
        if (choice == 1) {
            System.out.print("Enter first int: ");
            interA = scannerIntV2();
            System.out.print("Enter second int: ");
            interB = scannerInt();
            System.out.println("Result: " + math.sum(interA, interB));

        } else if (choice == 2) {
            System.out.print("Enter first double: ");
            doubleA = scannerDouble();
            System.out.print("Enter second double: ");
            doubleB = scannerDouble();
            System.out.println("Result: " + math.sum(doubleA, doubleB));

        } else if (choice == 3) {
            scanner.nextLine();
            System.out.print("Enter first String: ");
            stringA = scanner.nextLine();
            System.out.print("Enter second String: ");
            stringB = scanner.nextLine();
            System.out.println("Result: " + math.sum(stringA, stringB));

        } else if (choice == 4) {
            System.out.print("Enter first int: ");
            interA = scannerInt();
            System.out.print("Enter second int: ");
            interB = scannerInt();
            System.out.print("Enter third int: ");
            interC = scannerInt();
            System.out.println("Result: " + math.sum(interA, interB, interC));

        } else {
            System.out.println("Invalid choice.");
        }
    }


    static int scannerInt() {
        boolean notInitialize = false;
        Scanner scanner = new Scanner(System.in);
        int value = -1;
        while (!notInitialize) {
            try {
                System.out.print("Enter an int: ");
                value = Integer.parseInt(scanner.next());
                notInitialize = true;
            } catch (NumberFormatException exception) {
                System.out.println("Error: Invalid type");
                scanner = new Scanner(System.in);
            }
        }
        return value;
    }

    static double scannerDouble() {
        boolean notInitialize = false;
        Scanner scanner = new Scanner(System.in);
        double value = -1;
        while (!notInitialize) {
            try {
                System.out.print("Enter a double: ");
                value = Double.parseDouble(scanner.next());
                notInitialize = true;
            } catch (NumberFormatException exception) {
                System.out.println("Error: Invalid type");
                scanner = new Scanner(System.in);
            }
        }
        return value;
    }

    static int scannerIntV2() {
        boolean notInitialize = false;
        Scanner scanner = new Scanner(System.in);
        int value = -1;
        while (!notInitialize) {
            try {
                System.out.print("Enter an int: ");
                value = Integer.parseInt(scanner.next());
                notInitialize = true;
            } catch (NumberFormatException exception) {
                //throw new NonIntegerException();
            }
        }
        return value;
    }


    // Exercice 3
    static void runExercise3(Scanner scanner) {
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
    static void runExercice4(Scanner scanner) {

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
    static void runExercise5(Scanner scanner) {

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

    // Exercise 6
    static void runExercise6() {
        TextProcessor processor = new TextProcessor();

        // processText() handles the scanner internally and returns the full summary
        String summary = processor.processText();

        System.out.println("\n--- Summary ---");
        System.out.println(summary);
    }

    // Exercise 7
    static void runExercise7(Scanner scanner) {
        Item mango = new Item("mango", 4);
        Item mangoDeLoum = new Item("mango", 4);

        // We check if two items with the same name and quantity are equal
        if (mango.equals(mangoDeLoum)) {
            System.out.println("mango and mangoDeLoum are equal!");
        }

        Inventory inventory = new Inventory();
        inventory.run(scanner);
    }

    // Exercise 8
    static void runExercise8(Scanner scanner) {
        SavingsAccount account = null;

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1 = Create account");
            System.out.println("2 = Deposit / Withdraw");
            System.out.println("3 = Show balance and interest");
            System.out.println("4 = Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter owner name: ");
                String owner = scanner.nextLine();
                System.out.print("Enter initial balance: ");
                double balance = scanner.nextDouble();
                System.out.print("Enter interest rate (%): ");
                double rate = scanner.nextDouble();
                scanner.nextLine();
                account = new SavingsAccount(owner, balance, rate);
                System.out.println("Account created: " + account);

            } else if (choice == 2) {
                if (account == null) {
                    System.out.println("No account found. Please create one first.");
                    continue;
                }
                System.out.println("1 = Deposit, 2 = Withdraw");
                int action = scanner.nextInt();
                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                // We use try-catch to handle the IllegalArgumentException from withdraw
                try {
                    if (action == 1) {
                        account.deposit(amount);
                    } else {
                        account.withdraw(amount);
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }

            } else if (choice == 3) {
                if (account == null) {
                    System.out.println("No account found. Please create one first.");
                    continue;
                }
                System.out.println(account);
                System.out.println("Interest earned: " + account.calculateInterest());

            } else if (choice == 4) {
                System.out.println("Exiting bank system.");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}