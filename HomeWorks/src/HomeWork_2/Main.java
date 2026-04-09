package HomeWork_2;

import HomeWork_2.Student;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Add existing students
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");
        manager.addStudent(s1);
        manager.addStudent(s2);

        // Add grades to existing students
        s1.addGrade("Math", 88);
        s1.addGrade("Science", 92);
        s2.addGrade("Math", 75);
        s2.addGrade("History", 80);

        // Add a new student with grades
        Student s3 = new Student(3, "Charlie");
        manager.addStudent(s3);
        s3.addGrade("Math", 95);
        s3.addGrade("English", 89);
        s3.addGrade("Science", 91);

        // Find a student by ID and add a grade
        Student found = manager.findStudentById(2);
        if (found != null) {
            found.addGrade("Science", 70);
        }

        // Display all students
        manager.displayAllStudents();
    }
}