// Superclass representing a Course
class Course {
    private String courseName;
    private String courseCode;
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
}

// Subclass representing a Student
class Student extends Course {
    private String studentName;
    private int studentId;

    public Student(String courseName, String courseCode, String studentName, int studentId) {
        super(courseName, courseCode); // Call superclass constructor
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }
}

// Subclass representing a Professor
class Professor extends Course {
    private String professorName;
    private String department;

    public Professor(String courseName, String courseCode, String professorName, String department) {
        super(courseName, courseCode); // Call superclass constructor
        this.professorName = professorName;
        this.department = department;
    }

    public String getProfessorName() {
        return professorName;
    }

    public String getDepartment() {
        return department;
    }
}

// Example usage
public class CourseTest {
    public static void main(String[] args) {
        Student student = new Student("Java Programming", "COP3337", "Alice", 12345);
        Professor professor = new Professor("Java Programming", "COP3337", "Dr. Bob", "Computer Science");

        System.out.println("Student: " + student.getStudentName() + ", ID: " + student.getStudentId() +
                ", Course: " + student.getCourseName() + " (" + student.getCourseCode() + ")");

        System.out.println("Professor: " + professor.getProfessorName() + ", Department: " + professor.getDepartment() +
                ", Course: " + professor.getCourseName() + " (" + professor.getCourseCode() + ")");
    }
}

