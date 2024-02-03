/**
 * This program allows the user to input the number of courses they are taking, along with the names and marks for each course.
 * It then calculates whether the student has passed or failed each course based on the marks.
 * The pass or fail status for each course is displayed alongside the course names.
 */
import java.util.Scanner;

public class StudentsResults {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number of Courses : " );
        int numCourses= scan.nextInt();

        String[] courseNames= new String[numCourses];
        double[] marks=new double[numCourses];

        for(int i=0; i<numCourses; i++)
        {
            scan.nextLine(); // conusme the newline character

            System.out.println("Enter the Name of Course "+ (i+1)+ " : " );
            courseNames[i]=scan.nextLine();

            System.out.println("Enter the marks for the course "+ courseNames[i]+ " : " );
            marks[i]=scan.nextDouble();

        }

        boolean[]  results= caculatePassFail(marks);

        System.out.println(" Course Grades : ");
        for (int i=0; i<numCourses; i++)
        {
            String courseStatus= results[i] ? "Pass":"Fail";

            System.out.println(courseNames[i] + " : " +courseStatus);
        }

        scan.close();

    }

    public static boolean[] caculatePassFail (double[] marks)
    {
        boolean[] results=new boolean[marks.length];

        for (int i=0; i<marks.length; i++)
        {
            results[i]=marks[i]>=50;
        }

        return results;
    }
}
