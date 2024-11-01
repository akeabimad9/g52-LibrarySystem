package se.lexicon;

 public class Main {
     public static void main(String[] args) {
         // Create some books
         Book book1 = new Book("Object Oriented Programming through JAVA", "P. Radha Krishna");
         Book book2 = new Book("2017", "M. T. Somashekara");
         Book book3 = new Book("Understanding Object Oriented Programming wih JAVA", "Timothy Budd");

         // Create a person
         Person person1 = new Person("Marcus", "Johan");

         // Display initial book information
         System.out.println(book1.getBookInformation());
         System.out.println(book2.getBookInformation());
         System.out.println(book3.getBookInformation());

         // Loan a book to person1
         person1.loanBook(book1);
         person1.loanBook(book2);

         // Try to loan a book that's already loaned out
         person1.loanBook(book1);

         // Display person information after borrowing books
         System.out.println(person1.getPersonInformation());

         // Return a book
         person1.returnBook(book1);

         // Try to return a book that wasn't borrowed
         person1.returnBook(book3);

         // Display updated book information and person information
         System.out.println(book1.getBookInformation());
         System.out.println(book2.getBookInformation());
         System.out.println(person1.getPersonInformation()); } }




