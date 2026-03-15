package OOP1.UMS;

public class Instructor extends Person {
    public String department;

    public Instructor(String name, String email, String department) {
        super(name, email);
        this.department = department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
