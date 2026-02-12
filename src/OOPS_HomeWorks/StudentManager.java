package OOPS_HomeWorks;

import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public Student findStudentById(int id) throws Exception {
        boolean hasFound = false;
        for (Student student : this.students) {
            if (student.id == id) {
                hasFound = true;
            }
        }
        if (hasFound) {
            return students.get(id);
        }
        throw new Exception("No Student Found");
    }

    public void displayAllStudents() {
        for (Student student : this.students) {
            student.getStudentInformation();
        }
    }
}
