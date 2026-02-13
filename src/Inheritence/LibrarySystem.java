package Inheritence;

import java.util.HashMap;
import java.util.Scanner;

public class LibrarySystem {
    public HashMap<String, Book> books = new HashMap<>();
    public HashMap<String, Member> members = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void listAllMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered in the library.");
            return;
        }

        System.out.println("List of Registered Members:");
        for (String id : members.keySet()) {
            System.out.println("Member ID: " + id +
                    ", Name: " + members.get(id).name);
        }
    }

    public void borrowBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Member ID: ");
        String memberId = scanner.nextLine();

        if (!members.containsKey(memberId)) {
            System.out.println("Member not found.");
            return;
        }
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        if (!books.containsKey(title)) {
            System.out.println("Book not found.");
            return;
        }

        Book book = books.get(title);

        if (!book.isAvailable) {
            System.out.println("Book is currently not available.");
            return;
        }
        book.isAvailable = false;
        members.get(memberId).borrowedBooks.add(book);

        System.out.println("Book borrowed successfully.");
    }

    public void returnBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Member ID: ");
        String memberId = scanner.nextLine();

        if (!members.containsKey(memberId)) {
            System.out.println("Member not found.");
            return;
        }

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        Member member = members.get(memberId);

        Book bookToReturn = null;

        for (Book book : member.borrowedBooks) {
            if (book.title.equalsIgnoreCase(title)) {
                bookToReturn = book;
                break;
            }
        }

        if (bookToReturn == null) {
            System.out.println("This member did not borrow this book.");
            return;
        }
        bookToReturn.isAvailable = true;
        member.borrowedBooks.remove(bookToReturn);

        System.out.println("Book returned successfully.");
    }


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


