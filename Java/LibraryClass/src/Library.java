import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Library {
    private final List<LibraryItem> books;
    //why are all list types of LibraryItem type and not of LibraryMember?

    private final List<LibraryMember> members;

    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public List<LibraryItem> getBooks(){ //this method returns a list which is why we must define it as list type
        return books;
    }

    public List<LibraryMember> getMembers(){
        return members;
    }

    public void checkOutItem(LibraryItem item, LibraryMember member, Date dueDate){
        member.checkOutItem(item,dueDate);
        books.remove(item);
    }

    public void returnItem(LibraryItem item, LibraryMember member, Date returndate){ //cannot have these two variables use the same word - both cannot be 'item'
        member.returnItem(item, returndate);
        books.add(item);
    }

    public void addMember(LibraryMember member){ //we don't care about defining the member's attributes here -
        // this method is only concerned about adding a member to the list}
        members.add(member);
    }

    public void removeMember(LibraryMember member){
        members.remove(member);
    }

    public void payFine(LibraryMember member, double amt){
        //we call the payFine method (which we created in the LibraryMethod class) using the member parameter (which is an object of LibraryMember class)
        member.payFine(amt);
    }

    public List<LibraryItem> listOverdueItems(LibraryMember member, Date date){
        List<LibraryItem> listOverdueItems = new ArrayList<>();
        for(LibraryItem book : member.getBooksCheckedOut()){
            //within the getBooksCheckedOut list for the given member
            // go through each of the books (item)
            if(book.getDueDate().before(date)){ //if the due date of the book I checked out is before today's date it will be marked overdue
                listOverdueItems.add(book); //here we add the book to the list if it is identified as overdue
            }
        }
        return listOverdueItems;
    }

    public void addBook(LibraryItem book) {
        books.add(book);
    }
}
