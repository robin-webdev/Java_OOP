package HomeWork_4;

public class Main {
    public static void main(String[] args) {
        Product p = new Product("Generic Product", 10.0, 100);
        Electronics e = new Electronics("Laptop", 1500.0, 50, 2);
        Clothing c = new Clothing("T-Shirt", 25.0, 200, "M", "Cotton");

        System.out.println(p.getProductInfo());

        System.out.println();
        System.out.println(e.getProductInfo());
        System.out.println(e.getWarrantyInfo());

        System.out.println();
        System.out.println(c.getProductInfo());
        System.out.println(c.getClothingInfo());
    }
}
