package Inheritence;


public class Book {
    public String title;
    public String author;
    public String isbn;
    public int pages;
    public boolean isAvailable;

    public Book(String title, String author, String isbn, int pages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.isAvailable = true;
    }

    public void setIsAvailable(Boolean value) {
        isAvailable = value;
    }

    public void borrowBook() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void getDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN : " + isbn);
        System.out.println("Pages : " + pages);
        System.out.println("Is Available : " + isAvailable);
    }

    public void showBookInformation() {

    }
}