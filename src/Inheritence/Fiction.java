package Inheritence;

public class Fiction extends Book {

    private final String genre;

    public Fiction(String title, String author, String isbn, int pages, String genre) {
        super(title, author, isbn, pages);
        this.genre = genre;
        this.isAvailable = true;
    }

    @Override
    public void showBookInformation() {
        System.out.println(getDetails() + " [Genre: " + genre + "]");
    }
}
