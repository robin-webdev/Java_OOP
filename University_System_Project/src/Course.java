package OOP1.UMS;

import java.util.ArrayList;

public class Course {
    public String courseName;
    public String courseCode;
    public Instructor instructor;
    public ArrayList<Student> students;

    public Course(String courseName, String courseCode, Instructor instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        this.students.add(student);
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("----------------------------");
        instructor.displayInfo();
        System.out.println("----------------------------");
        System.out.println("Enrolled Students: ");
        for (Student student : students) {
            student.displayInfo();
            System.out.println("-------------------------");
        }
    }

}
