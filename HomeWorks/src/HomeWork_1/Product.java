package HomeWork_1;

public class Product {
    String name;
    double price;
    int quantity;
    String category;

    Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    void displayDetails() {
        System.out.println("-----------------------------");
        System.out.println("Name     : " + name);
        System.out.println("Category : " + category);
        System.out.println("Price    : $" + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("-----------------------------");
    }

    void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
        System.out.println("Discount of " + percentage + "% applied to " + name + ". New price: $" + price);
    }

    void restock(int amount) {
        quantity += amount;
        System.out.println("Restocked " + name + " by " + amount + ". New quantity: " + quantity);
    }

    void sell(int amount) {
        if (amount > quantity) {
            System.out.println("Error: Not enough stock for " + name + ". Requested: " + amount + ", Available: " + quantity);
        } else {
            quantity -= amount;
            System.out.println("Sold " + amount + " unit(s) of " + name + ". Remaining: " + quantity);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 999.99, 10, "Electronics");
        Product p2 = new Product("Notebook", 4.99, 200, "Stationery");
        Product p3 = new Product("Headphones", 149.99, 15, "Electronics");

        // Display all products
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();

        // Apply discount to p1
        p1.applyDiscount(10);

        // Restock p2
        p2.restock(50);

        // Try to sell more than available from p3
        p3.sell(20);
    }
}