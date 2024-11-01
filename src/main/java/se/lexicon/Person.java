package se.lexicon;

// Person.java
import java.util.ArrayList;
import java.util.List;
public class Person {
    private static int sequencer = 0;

    // Static variable for unique IDs
    private int id;
    private String firstName;
    private String lastName;
    private List<Book> borrowedBooks;

    // Constructor
    public Person(String firstName, String lastName) {
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowedBooks = new ArrayList<>();
    }

    // Method to generate a unique ID
    private int getNextId() {
        return ++sequencer; }

    // Method to loan a book if it is available
    public void loanBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println(firstName + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("The book '" + book.getTitle() + "' is currently unavailable.");
        } }

    // Method to return a borrowed book
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
            System.out.println(firstName + " returned the book: " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by " + firstName + ".");
        } }

    // Method to get person information including borrowed books
    public String getPersonInformation() {
        StringBuilder info = new StringBuilder();
        info.append("Person ID: ").append(id) .append(", Name: ").append(firstName).append(" ").append(lastName) .append(", Borrowed Books: ");
        for (Book book : borrowedBooks) {
            info.append(book.getTitle()).append(", ");
        }
        return info.toString();
    }

    // Getters and setters for firstName and lastName (if needed)

     public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName; } }



