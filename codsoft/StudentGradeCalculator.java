import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the student's name
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        // Get the student's score
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        // Calculate the student's grade
        String grade;
        if (score >= 90) {
            grade = "A+";
        } else if (score >= 80) {
            grade = "A";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 60) {
            grade = "C";
        }else if (score >=40) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the student's grade
        System.out.println("The student's grade is: " + grade);
    }
}