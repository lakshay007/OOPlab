import java.util.*;
import java.lang.*;

public class Book {
    private String title;
    private String author;
    private int edition;

    public Book(String title, String author, int edition) {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        // books[0] = new Book("Book1", "Author1", 1);
        // books[1] = new Book("Book2", "Author2", 2);
        // books[2] = new Book("Book3", "Author2", 3);
        // books[3] = new Book("Book4", "Author3", 1);
        // books[4] = new Book("Book5", "Author4", 2);
        // books[5] = new Book("Book6", "Author5", 1);
        System.out.println("enter the number of books");
        int n = sc.nextInt();
        Book[] books = new Book[n];
        for(int i = 0;i<n;i++){
            System.out.println("name of book");
            String boook = sc.next();
            System.out.println("author of book");
            String auth = sc.next();
            System.out.println("edition of book");
            int edition = sc.nextInt();
            books[i] = new Book(boook,auth,edition);
        }

        System.out.print("Enter the author's name: ");
        String authorName = sc.next();

        boolean found = false;
        System.out.println("Books by " + authorName + ":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(authorName)) {
                System.out.println("Title: " + book.getTitle() + ", Edition: " + book.getEdition());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found by " + authorName);
        }
    }
}