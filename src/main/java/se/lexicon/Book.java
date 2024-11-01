package se.lexicon;

// Book.java
public class Book {
    private String id;
    private String title;
    private String author;
    private boolean available;

    // Constructor for an available book
public Book(String title, String author) {
    this.id = generateId();
    this.title = title;
    this.author = author;
    this.available = true;  // Book is available by default
     }

     // Method to generate a unique ID (simple hash for demonstration)
private String generateId() {
    return Integer.toString(this.hashCode());
}

// Method to get book information
public String getBookInformation() {
    String status = available ? "Available" : "Not Available";
    return "Book ID: " + id + ", Title: " + title + ", Author: " + author + ", Status: " + status;
}

// Getters and setters for title, author, and availability
public String getTitle() {
    return title;
}
public void setAvailable(boolean available) {
    this.available = available;
}
public boolean isAvailable() {
    return available;
} }



