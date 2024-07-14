import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display the information
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);

        // Close the scanner
        scanner.close();
    }
}
