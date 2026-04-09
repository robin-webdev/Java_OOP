package HomeWork_2;

import java.util.HashMap;

public class Student {
    int id;
    String name;
    HashMap<String, Integer> grades;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new HashMap<>();
    }

    void addGrade(String subject, int grade) {
        grades.put(subject, grade);
        System.out.println("Added grade for " + name + " -> " + subject + ": " + grade);
    }

    double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    void getStudentInformation() {
        System.out.println("-----------------------------");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Grades : " + grades);
        System.out.printf("Average: %.2f%n", getAverageGrade());
        System.out.println("-----------------------------");
    }
}