package Inheritence;

public class Comic extends Book{
    public String illustrator;
    public Comic(String title, String author, String isbn, int pages, String illustrator) {
        this.illustrator = illustrator;
        setIsAvailable(true);
    }
    public void showBookInformation() {
        getDetails();
        System.out.println(" [Illustraitor: " + illustrator + "]");
    }
}
