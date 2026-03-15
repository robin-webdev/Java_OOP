import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Scanner;

public class program {

    void main(String[] args) {
//        var sc = new Scanner(System.in);
//
//        var arr = new LinkedList<Number>();
//
//        System.out.print("How many items do you want to add : ");
//        var number = Integer.parseInt(sc.nextLine());
//        int biggest = 0;
//
//
//        for (int i = 0; i < number; i++) {
//            System.out.print("Enter the element you want to add : ");
//            var element = Integer.parseInt(sc.nextLine());
//            if (element > biggest) {
//                biggest = element;
//            }
//            arr.add(element);
//        }
//        for (int i = 0; i < number; i++) {
//          System.out.print(arr.get(i));
//        }
//        System.out.println("The biggest number is : " + biggest);
//        oops();
//        oop2();
//        bubbleSort();
//        insertionSort();
        insertionSort2();
    }

    static void insertionSort2() {
        int[] arr = {3, 5, 6, 2, 6, 7};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // arr[3] = 2
            int j = i - 1; // 2
            while (j >= 0 && arr[j] > key) { // arr[2](6) > 2
                arr[j + 1] = arr[j];
                j--; // 1
            }
            arr[j + 1] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    static void insertionSort() {
//        int[] arr = {5, 8, 7, 9, 2, 3, 4};
        String str = "Apple";
        System.out.println("Old : " + str);
        char[] arr = str.toCharArray();

        for (int i = 1; i < arr.length; i++) {
            char element = arr[i];
            int j = i - 1; // 1

            while (j >= 0 && Character.toLowerCase(arr[j]) > Character.toLowerCase(element)) { // 8 > 7
                arr[j + 1] = arr[j]; // arr[2] = 8
                j = j - 1;
            }
            arr[j + 1] = element; // arr[1] = 8

        }
        System.out.print("Sorted : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    static void bubbleSort() {
        int[] arr = {5, 8, 7, 9, 2, 3, 4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int element = arr[j];
                int nextElement = arr[j + 1];
                if (element > nextElement) {
                    arr[j] = nextElement;
                    arr[j + 1] = element;
                }
            }
        }
        System.out.println("Sorted : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    static void oop2() {
        Book book1 = new Book("Atomic Habits", "James Clear", 150, 10);
        Book book2 = new Book("Ikigai", "Murakami", 250, 15);

        System.out.println("Before Discount and pages added");
        book1.displayDetails();
        book2.displayDetails();
        System.out.println("-----------------------------------");
        book1.applyDiscount(45);
        book2.increasePages(25);
        book1.displayDetails();
        book2.displayDetails();

    }


    static void oops() {

        Cat firsCat = new Cat();
        Cat seconCat = new Cat();
//
//        firsCat.age = 5;
//        firsCat.name = "Joji";
//        firsCat.breed = "Black";
//        firsCat.meow();
//        firsCat.sleep();
//        System.out.println("Name : " + firsCat.name);
//        System.out.println("Age : " + firsCat.age);
//        System.out.println("Breed : " + firsCat.breed);

//        Circle newCir = new Circle(5);
//        double area = newCir.calculateArea();
//        double circum = newCir.calculateCircumference();
//        System.out.println("Radius : " + newCir.radius);
//        System.out.println("Area : " + area);
//        System.out.println("Circumference : " + circum);


        Scanner sc = new Scanner(System.in);

        System.out.print("How many students do you want to add : ");
        int count = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter Student Name : ");
            String name = sc.nextLine();
            System.out.print("Enter Student Age : ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Student Grade : ");
            char grade = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Student " + i + " Info : ");
            students[i] = new Student(age, name, grade);

        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
            students[i].displayInfo();

        }


    }


    static void main2(String[] args) {
        var sc = new Scanner(System.in);
        var part = new Participant();
        System.out.print("Enter your Name: ");
        part.name = sc.nextLine();
//        System.out.println();

        System.out.print("Enter your Surname: ");
        part.surName = sc.nextLine();
//        System.out.println();

        System.out.print("Enter your Number: ");
        part.phoneNumber = sc.nextLine();
//        System.out.println();

        System.out.print("Enter your Ticket: ");
        part.ticket = sc.nextInt();

        part.details();

    }
}
