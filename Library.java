import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(int bookId, User user) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (!book.isIssued()) {
                    book.issueBook();
                    System.out.println(user.getName() + " issued \"" + book.getTitle() + "\".");
                } else {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int bookId, User user) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println(user.getName() + " returned \"" + book.getTitle() + "\".");
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
