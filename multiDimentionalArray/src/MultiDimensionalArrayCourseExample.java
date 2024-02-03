/**
 * This program allows the user to input the number of courses they are taking, along with the names and marks for each course.
 * It then calculates whether the student has passed or failed each course based on the marks.
 * The pass or fail status for each course is displayed alongside the course names.
 * The program uses a 2D array to store the course data, where each row represents a course with its name and marks.
 * The main method handles user input, data processing, and output display using loops and conditional statements.
 * This program demonstrates the use of arrays, loops, user input handling, and method invocation in Java.
 */
import java.util.Scanner;

public class MultiDimensionalArrayCourseExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt(); //2 was input
        scanner.nextLine(); // Consume the newline character

        String[][] courseData = new String[numCourses][2]; // 2D array to store course names and marks

        // Input course names and marks for each course
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter the name of Course " + (i + 1) + ": ");
            courseData[i][0] = scanner.nextLine();
            System.out.print("Enter the marks for Course " + courseData[i][0] + ": ");
            courseData[i][1] = scanner.nextLine();
        }

        // Display course names and pass/fail status for each course using foreach loop
        System.out.println("\nCourse Grades:");
        for (String[] course : courseData) {
            int marks = Integer.parseInt(course[1]); // Convert marks to an integer
            String courseStatus = marks >= 50 ? "Pass" : "Fail"; // Assuming pass mark is 50
            System.out.println(course[0] + ": " + courseStatus);
        }

        scanner.close();
    }
}
