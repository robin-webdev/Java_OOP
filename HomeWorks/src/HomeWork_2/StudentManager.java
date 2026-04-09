package HomeWork_2;

import HomeWork_2.Student;

import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students;

    StudentManager() {
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student.name);
    }

    Student findStudentById(int id) {
        for (Student s : students) {
            if (s.id == id) return s;
        }
        System.out.println("Student with ID " + id + " not found.");
        return null;
    }

    void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        System.out.println("\n===== All Students =====");
        for (Student s : students) {
            s.getStudentInformation();
        }
    }
}