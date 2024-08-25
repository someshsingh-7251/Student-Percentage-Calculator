import java.util.Scanner;
public class StudentPercentageCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Declare an array to hold marks for 5 subjects
        int[] marks = new int[5];
        int totalMarks = 0;
        // Loop to take input for each subject
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i]; // Add the marks to totalMarks
        }
        // Calculate percentage
        double percentage = (totalMarks / 500.0) * 100;
        // Display the total marks and percentage
        System.out.println("Total Marks: " + totalMarks + " out of 500");
        System.out.println("Percentage: " + percentage + "%");
        scanner.close();
    }
}
