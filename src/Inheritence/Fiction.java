package Inheritence;

public class Fiction extends Book {

    private final String genre;

    public Fiction(String title, String author, String isbn, int pages, String genre) {
        this.genre = genre;
        this.isAvailable = true;
    }

    @Override
    public void showBookInformation() {
        getDetails();
        System.out.println(" [Genre: " + genre + "]");
    }
}
