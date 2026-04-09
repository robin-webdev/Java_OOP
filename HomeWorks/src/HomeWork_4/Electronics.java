package HomeWork_4;

public class Electronics extends Product {
    int warranty;

    Electronics(String name, double price, int quantity, int warranty) {
        super(name, price, quantity);
        this.warranty = warranty;
    }

    String getWarrantyInfo() {
        return "Warranty: " + warranty + " years";
    }
}
