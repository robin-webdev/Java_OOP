package Inheritence;

public class Main {

    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.addBookToSystem(new Fiction("Harry Potter", "J.K. Rowling", "1234", 500, "Fantasy"));
        librarySystem.addBookToSystem(new NonFiction("A Brief History of Time ", "Stephen Hawking", "5678", 200, "Science"));
        librarySystem.addBookToSystem(new Comic("Batman: Year One", "Frank Miller", "9101", 150, "David Mazzucchelli"));
        librarySystem.addMemberToSystem(new Member("Alice", "M001"));
        librarySystem.addMemberToSystem(new Member("Bob", "M002"));
    }
}
