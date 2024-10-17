import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create some LibraryItem objects
        LibraryItem book1 = new Book("To Kill a Mockingbird", "Harper Lee", "9780446310789", 1960);
        LibraryItem book2 = new Book("1984", "George Orwell", "9780451524935", 1949);
        // Create a LibraryMember object
        LibraryMember member1 = new LibraryMember("John Smith");

        // Create a Library object and add the LibraryItem objects to its list of books
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        // Add the LibraryMember object to the library's list of members
        library.addMember(member1);

        // Demonstrate checking out and returning LibraryItem objects by the LibraryMember object
        library.checkOutItem(book1, member1, new Date());
        library.returnItem(book1, member1, new Date());

        // Print out the member's name, list of checked out items, and fines owed
        System.out.println(member1.getName() + "'s checked out items: " + member1.getBooksCheckedOut());
        System.out.println(member1.getName() + "'s fines owed: " + member1.getFinesOwed());

        // Print out the list of overdue items for the member
        System.out.println("Overdue items for " + member1.getName() + ": " + library.listOverdueItems(member1, new Date()));

        // Pay some fines for the member
        library.payFine(member1, 5.0);
        System.out.println(member1.getName() + "'s fines owed after paying $5.0: " + member1.getFinesOwed());

        // Remove the member from the library's list of members
        library.removeMember(member1);

        // Print out the list of books in the library
        System.out.println("Books in the library: " + library.getBooks());
    }
}
