package Inheritence;

public class NonFiction extends Book{
    private String field;
     public NonFiction(String title, String author,String isbn, int pages, String field){
         this.field= field;
         setIsAvailable(true);
     }
    public void showBookInformation() {
        System.out.println("[Field:" + field + "]");
    }
}
