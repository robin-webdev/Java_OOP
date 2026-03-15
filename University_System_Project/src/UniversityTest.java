package OOP1.UMS;

public class UniversityTest {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Dr. John Smith", "john.smith@turiba.lv", "Computer Science");

        Student student1 = new Student("Alice Brown", "alice.brown@student.turiba.lv", "S101");
        Student student2 = new Student("Mike Wheeler", "mike.wheeler@student.turiba.lv", "S102");

        Course course = new Course("Java Advanced", "CSA1D1", instructor);

        course.enrollStudent(student1);
        course.enrollStudent(student2);

        course.displayCourseInfo();

    }
}
