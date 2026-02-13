package Inheritence;


public class Book {
    public String title;
    public String author;
    public String isbn;
    public int pages;
    public boolean isAvailable;

    public Book(){

    }

    public void borrowBook(){
        isAvailable = false;
    }

    public void returnBook(){
        isAvailable = true;
    }

    public void getDetails(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN : " + isbn);
        System.out.println("Pages : " + pages);
        System.out.println("Is Available : " + isAvailable);
    }

    public void showBookInformation(){

    }
}