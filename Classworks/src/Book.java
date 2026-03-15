public class Book {
    public String title;
    public String author;
    public int pages;
    public double price;

    public Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Pages : " + pages);
        System.out.println("Price : $" + price);
    }

    public double applyDiscount(double percent) {
        this.price = (percent / 100) * this.price;
        return this.price;
    }

    public int increasePages(int extraPages) {
        this.pages += extraPages;
        return this.pages;
    }
}
