import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        System.out.print("Enter number of books to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();
            library.addBook(new Book(id, title));
        }

        System.out.print("\nEnter your User ID: ");
        int userId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();
        User user = new User(userId, userName);

        int choice;
        do {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    library.issueBook(issueId, user);
                    break;
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId, user);
                    break;
                case 4:
                    System.out.println("Exiting. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
