package OOP1;

public class Product {
    private String productName;
    private String category;
    private int productID;
    private double price;


    public Product(String productName, String category, int productID, double price) {
        this.productName = productName;
        this.category = category;
        this.productID = productID;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public int getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
