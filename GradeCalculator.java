import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        // Determine grade
        String grade;
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Output result
        System.out.println("\n--- Result ---");
        System.out.println("Student: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
