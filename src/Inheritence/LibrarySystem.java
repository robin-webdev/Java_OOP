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
}
