package Inheritence;

public class NonFiction extends Book {
    public String field;

    public NonFiction(String title, String author, String isbn, int pages, String field) {
        this.field = field;
        setIsAvailable(true);
    }

    public void showBookInformation() {
        getDetails();
        System.out.println("[Field:" + field + "]");
    }
}
