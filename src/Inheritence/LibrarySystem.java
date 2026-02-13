package Inheritence;

import java.util.HashMap;
import java.util.Scanner;

public class LibrarySystem {
    public HashMap<String, Book> books = new HashMap<>();
    public HashMap<String, Member> members = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void librarySystem() {
        books = new HashMap<>();
        members = new HashMap<>();
        sc = new Scanner(System.in);

    }

    public void addBookToSystem(Book book) {
        books.put(book.isbn, book);
        System.out.println("Book added successfully");

    }

    public void addMemberToSystem(Member member) {
        members.put(member.id, member);
        System.out.println("Member added successfully");
    }

    public void listAllBooks(){
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        } for (Book book : books.values()) {
            System.out.println(book.getDetails());
            System.out.println("---------------");
        }
    }


    }


