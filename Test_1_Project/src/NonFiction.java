package Inheritence;

public class NonFiction extends Book {
    public String field;

    public NonFiction(String title, String author, String isbn, int pages, String field) {
        super(title, author, isbn, pages);
        this.field = field;
    }


    public void showBookInformation() {
        getDetails();
        System.out.println("[Field:" + field + "]");
    }
}
