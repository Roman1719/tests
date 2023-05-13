public class Library {
    private Book[] books = new Book[5];
    private int count = 0;

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("The library is full.");
        }
    }

    public void printAllBooks() {
        System.out.println("All books in the library:");
        for (int i = 0; i < count; i++) {
            books[i].getInfo();
        }
    }

    public void printBooksByPageCount(int pageCount) {
        System.out.println("Books with " + pageCount + " pages:");
        for (int i = 0; i < count; i++) {
            if (books[i].getPageCount() == pageCount) {
                books[i].getInfo();
            }
        }
    }
}
