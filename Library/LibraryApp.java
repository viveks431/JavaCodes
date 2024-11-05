package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book 
{
    //Attributes
    private String title;
    private String author;
    private boolean isAvailable;

    //constructer
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.isAvailable = true; //set to true default
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public boolean isAvailable()
    {
        return isAvailable;
    }
    public void checkOut()
    {
        if (isAvailable) 
        {
         isAvailable = false;
         System.out.println("Checked Out" + title);   
        }
        else
        {
            System.out.println("Already issued out");
        }
    }
    public void returnBook()
    {
        if (!isAvailable) 
        {
            isAvailable = true;
            System.out.println("Return noted");
        }
        else
        {
            System.out.println("Not checked out");
        }
    }
}
class Library
{
    private List<Book> books;

    public Library()
    {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book)
    {
        books.add(book);
        System.out.println("Book Added: " + book.getTitle());
    }
    public void displayAvailableBook()
    {
        for(Book book : books)
        {
            if(book.isAvailable())
            {
                System.out.println(book.getTitle() + "by" + book.getAuthor() + "is available");
            }
        }
    }
    public void issueBook(String title)
    {
        for (Book book : books)
        {
            if(book.getTitle().equalsIgnoreCase(title) && book.isAvailable())
            {
               book.checkOut();
               return;
            }
        }
        System.out.println("Book not found/already checked out");
    }
    public void returnBook(String title) 
    {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found/checked out.");
    }
}
public class LibraryApp
{
    public static void main(String[] args)
    {
        Library library = new Library(); 
        Scanner scanner = new Scanner(System.in); 

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Check Out Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Available Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                    break;

                case 2:
                    System.out.print("Enter title of the book to check out: ");
                    title = scanner.nextLine();
                    library.issueBook(title);
                    break;

                case 3:
                    System.out.print("Enter title of the book to return: ");
                    title = scanner.nextLine();
                    library.returnBook(title);
                    break;

                case 4:
                    library.displayAvailableBook();
                    break;

                case 5:
                    System.out.println("Exiting Library App. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}