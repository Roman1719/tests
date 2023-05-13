import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("The Great Gatsby", 180, "Classic"));
        library.addBook(new Book("To Kill a Mockingbird", 281, "Classic"));
        library.addBook(new Book("1984", 328, "Dystopian"));
        library.addBook(new Book("The Catcher in the Rye", 224, "Contemporary"));
        library.addBook(new Book("The Hobbit", 310, "Fantasy"));

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Print all books");
            System.out.println("2. Print books by page count");
            System.out.println("3. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.printAllBooks();
                    break;
                case 2:
                    System.out.print("Enter page count: ");
                    int pageCount = scanner.nextInt();
                    library.printBooksByPageCount(pageCount);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
                    break;
            }
        }

        scanner.close();
    }
    }
