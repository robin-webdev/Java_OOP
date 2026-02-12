import OOPS_HomeWorks.Product;
import OOPS_HomeWorks.Student;
import OOPS_HomeWorks.StudentManager;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
//        HomeWork_1();
        HomeWork_2();
    }

    public static void HomeWork_1() {
        Product prod_1 = new Product("Laptop", 750, 89, "Electronics");
        Product prod_2 = new Product("Mobile", 450, 57, "Electronics");
        Product prod_3 = new Product("Chair", 80, 45, "Furniture");

        prod_1.displayDetails();
        prod_2.displayDetails();
        prod_3.displayDetails();

        prod_1.applyDiscount(49);
        prod_1.displayDetails();

        prod_2.restock(25);
        prod_2.displayDetails();

        prod_3.sell(101);

    }

    public static void HomeWork_2() {
        StudentManager students = new StudentManager();

        Student student_1 = new Student(101, "Alex");
        student_1.addGrade();

        Student student_2 = new Student(101, "Joy");
        student_2.addGrade();

        students.addStudent(student_1);
        students.addStudent(student_2);

        students.displayAllStudents();

    }
}