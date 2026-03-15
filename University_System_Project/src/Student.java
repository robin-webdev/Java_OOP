package OOP1.UMS;

public class Student extends Person {
    public String StudentId;

    public Student(String name, String email, String studentId) {
        super(name, email);
        this.StudentId = studentId;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student Id: " + StudentId);
    }
}
