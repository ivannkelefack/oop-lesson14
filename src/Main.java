import oop.exercice1.Student;
import oop.exercice2.MathUtils;

import java.util.Scanner;

void main() {
    // Create the scanner
    Scanner scanner = new Scanner(System.in);


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

    // We create a new object called math --> we are realizing here a sum, which is a math operation (the name doesn't really matter, it just to be coherent)
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

    // We use a if, else statement so it can apply each method propreties
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


    scanner.close();
}
