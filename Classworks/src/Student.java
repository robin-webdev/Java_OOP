public class Student {
    public String name;
    public int age;
    public char grade;

    public Student(int age, String name, char grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("-----------------------------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Grade : " + grade);
        System.out.println("-----------------------------");
    }
}
