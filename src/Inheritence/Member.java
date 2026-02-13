package Inheritence;

import java.util.ArrayList;

public class Member {
    public String name;
    public String id;
    public ArrayList<Book> borrowedBooks;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
        book.isAvailable = false;
    }

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
        book.iwsAvailable = true;
    }

    public void viewBorrowedBook() {
        System.out.println("Currently borrowed Books : ");
        for (Book book : borrowedBooks) {
            System.out.println("->" + book.title);
        }
    }

}