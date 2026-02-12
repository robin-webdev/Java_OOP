package OOPS_HomeWorks;

import java.util.HashMap;
import java.util.Scanner;

public class Student {
    public int id;
    public String name;
    public HashMap<String, Integer> grades;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public HashMap<String, Integer> addGrade() {
        Scanner sc = new Scanner(System.in);
        var grades = new HashMap<String, Integer>();
        System.out.print("How many subjects do you have? : ");
        int subjectsCount = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < subjectsCount; i++) {

            System.out.print("Enter the Subjects name : ");
            String subject = sc.nextLine();
            System.out.printf("Enter %s Marks : ", subject);
            int marks = Integer.parseInt(sc.nextLine());

            grades.put(subject, marks);
        }

        this.grades = grades;

        return grades;
    }

    public int getAverageGrades() {
        var marksArray = grades.values();
        int totalMarks = 0;
        for (int marks : marksArray) {
            totalMarks += marks;
        }
        return totalMarks / marksArray.size();
    }

    public void getStudentInformation() {
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Name : %s%n", name);
        for (String subject : grades.keySet()) {
            System.out.printf("%s : %d%n", subject, grades.get(subject));
        }
        System.out.println("-------------------------------------------------------------");
    }

}
