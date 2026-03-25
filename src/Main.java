import oop.exercice1.Student;
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
    // Example: Student{name = 'Ivan', age = 20, Average Grade = 81.0 }
    Student student = new Student(name, age, averageGrade);

    System.out.println(student);

    scanner.close();
}
