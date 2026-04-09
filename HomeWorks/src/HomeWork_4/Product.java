package HomeWork_4;

public class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    String getProductInfo() {
        return "Product: " + name + ", Price: $" + price + ", Quantity: " + quantity;
    }
}
