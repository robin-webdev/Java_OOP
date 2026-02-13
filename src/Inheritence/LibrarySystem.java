package Inheritence;

import java.util.ArrayList;
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
            System.out.println("Member ID: " + id + ", Name: " + members.get(id).name);
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

    public void viewMemberBooks() {
        System.out.print("Enter the member id : ");
        String id = sc.nextLine();
        ArrayList<Book> books = members.get(id).borrowedBooks;
        for (Book book : books) {
            System.out.println(book.title);
        }
    }

    public Member getMemberInformation() {
        System.out.print("Enter the member id : ");
        String id = sc.nextLine();
        return members.get(id);
    }

    public void interact() {
        System.out.println("-------------------Library Menu:-----------");
        System.out.println("1. List All Books");
        System.out.println("2. List All Members");
        System.out.println("3. Add Member");
        System.out.println("4. Borrow a Book");
        System.out.println("5. Return a Book");
        System.out.println("6. View Member's Borrowed Books");
        System.out.println("7. Exit");

        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                listAllBooks();
                break;
            case 2:
                listAllMembers();
                break;
            case 3:
                System.out.println("Enter Member Name : ");
                String name = sc.nextLine();
                System.out.println("Enter Member Id : ");
                String id = sc.nextLine();
                Member member = new Member(name, id);
                addMemberToSystem(member);
                break;
            case 4:
                borrowBook();
                break;
            case 5:
                returnBook();
                break;
            case 6:
                viewMemberBooks();
                break;
            case 7:
                break;
            default:
                System.out.println("Invalid Input...");
                break;
        }

    }

    public void addBookToSystem(Book book) {
        books.put(book.isbn, book);
        System.out.println("Book added successfully");

    }

    public void addMemberToSystem(Member member) {
        members.put(member.id, member);
        System.out.println("Member added successfully");
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book book : books.values()) {
            System.out.println(book.getDetails());
            System.out.println("---------------");
        }
    }


}


