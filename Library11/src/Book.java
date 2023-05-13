public class Book {
    private String title;
    private int pageCount;
    private String genre;

    public Book(String title, int pageCount, String genre) {
        this.title = title;
        this.pageCount = pageCount;
        this.genre = genre;
    }

    public void getInfo() {
        System.out.println(title + " (" + genre + "), " + pageCount + " pages");
    }

    public int getPageCount() {
        return pageCount;
    }
}
