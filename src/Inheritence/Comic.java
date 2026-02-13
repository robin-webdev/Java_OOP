package Inheritence;

public class Comic extends Book {

    private String illustrator;

    public Comic(String title, String author, String isbn, int pages, String illustrator) {
        super(title, author, isbn, pages);
        this.illustrator = illustrator;
    }

    @Override
    public void showBookInformation() {
        getDetails();
        System.out.println(" [Illustrator: " + illustrator + "]");
    }
}
