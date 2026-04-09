package HomeWork_4;

public class Clothing extends Product {
    String size;
    String material;

    Clothing(String name, double price, int quantity, String size, String material) {
        super(name, price, quantity);
        this.size = size;
        this.material = material;
    }

    String getClothingInfo() {
        return "Size: " + size + ", Material: " + material;
    }
}