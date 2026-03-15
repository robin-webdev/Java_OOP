package Inheritence;

public class Fiction extends Book {

    private final String genre;

    public Fiction(String title, String author, String isbn, int pages, String genre) {
        super(title, author, isbn, pages);
        this.genre = genre;
    }


    @Override
    public void showBookInformation() {
        getDetails();
        System.out.println(" [Genre: " + genre + "]");
    }
}
