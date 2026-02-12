package OOPS_HomeWorks;

public class Product {
    public String name;
    public double price;
    public int quantity;
    public String category;

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public void displayDetails() {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("Name : %s%nPrice : %f%nQuantity : %d%nCategory : %s%n", this.name, this.price, this.quantity, this.category);
        System.out.println("-----------------------------------------------------------------------------------");
    }

    public double applyDiscount(double percentage) {
        double newPrice = this.price * (percentage / 100);
        this.price = newPrice;
        return newPrice;
    }

    public int restock(int amount) {
        this.quantity += amount;
        return this.quantity;
    }

    public int sell(int amount) {
        if (amount < this.quantity) {
            this.quantity -= amount;
        } else {
            System.out.printf("Error : Only %d products are available.", this.quantity);
        }
        return this.quantity;
    }
}
