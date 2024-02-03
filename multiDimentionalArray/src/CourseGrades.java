import java.util.Scanner;

public class CourseGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        String[] courseNames = new String[numCourses];
        int[] marks = new int[numCourses];

        // Input course names and marks for each course
        for (int i = 0; i < numCourses; i++) {
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter the name of Course " + (i + 1) + ": ");
            courseNames[i] = scanner.nextLine();
            System.out.print("Enter the marks for Course " + courseNames[i] + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate pass/fail for each course
        boolean[] results = calculatePassFail(marks);

        // Display course names and pass/fail status for each course
        System.out.println("\nCourse Grades:");
        for (int i = 0; i < numCourses; i++) {
            String courseStatus = results[i] ? "Pass" : "Fail";
            System.out.println(courseNames[i] + ": " + courseStatus);
        }

        scanner.close();
    }

    // Method to calculate pass/fail for each course
    public static boolean[] calculatePassFail(int[] marks) {
        boolean[] results = new boolean[marks.length];
        for (int i = 0; i < marks.length; i++) {
            results[i] = marks[i] >= 50; // Assuming pass mark is 50
        }
        return results;
    }
}
