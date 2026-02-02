import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        var list = new ArrayList<Product>();
        var sc = new Scanner(System.in);
        var menuItem = 0;
        do {
            printMenu();
            menuItem = nextSafeInt(sc, "Enter your choice : ");
            switch (menuItem) {
                case 1:
                    addNew(sc, list);
                    break;
                case 2:
                    showAll(list);
                    break;
                case 3:
                    System.out.println("See you soon!");
                    break;
                case 4:
                    minMax(list);
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        } while (menuItem != 3);

    }


    public static int nextSafeInt(Scanner sc, String str) {
        do {
            try {
                System.out.print(str);
                return Integer.parseInt(sc.nextLine());
            } catch (Exception exc) {
                System.out.println("Invalid Input! Integer Expected.");
            }
        } while (true);

    }

    private static void printMenu() {
        System.out.println("1. Add New");
        System.out.println("2. Show All");
        System.out.println("3. Quit");
        System.out.println("4. Minimum and Maximum Prices");
    }

    private static void addNew(Scanner sc, ArrayList<Product> list) {
        var newItem = new Product();
        System.out.print("Please enter name : ");
        newItem.name = sc.nextLine();
        int price = nextSafeInt(sc, "Please Enter price : ");
        if (price <= 0) {
            newItem.price = 1;
        } else {
            newItem.price = price;
        }
        list.add(newItem);

    }

    private static void showAll(ArrayList<Product> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).getInfo();
        }
    }


    private static void minMax(ArrayList<Product> list) {
        Product minPrice = list.getFirst();
        Product maxPrice = list.getFirst();
        for (int i = 0; i < list.size(); i++) {
            Product item = list.get(i);

            if (item.price <= minPrice.price) {
                minPrice = item;
            }
            if (item.price >= maxPrice.price) {
                maxPrice = item;
            }
        }

        System.out.println("Maximum - " + maxPrice.name + " " + maxPrice.price);
        System.out.println("Minimum - " + minPrice.name + " " + minPrice.price);
    }
}