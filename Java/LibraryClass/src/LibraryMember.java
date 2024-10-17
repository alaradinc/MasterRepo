import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryMember {
    private final String name;
    private final List<LibraryItem> booksCheckedOut;
    //we can make booksCheckOut final because its pointer doesn't change,
    // final doesn't mean that the list's contents are final
    // you are still able to edit the contents of the string
    //create a list that will be able to hold objects of LibraryItem type
                                        // should be a list of LibraryItem checked out by member
    private double finesOwed; // total of finesOwned by member

    public LibraryMember(String name){ //should we not have more inputs that just name?
        this.finesOwed = 0.0; //initialize this as 0 so we know what to start from
        this.name = name;
        booksCheckedOut = new ArrayList<>(); //initialization
        //you cannot say 'booksCheckedOut = new List<>' because it is an interface (abstract class)
        //therefore, you define the concrete type of list class you will be creating 'ArrayList'
    }   //by defining the concrete type of class you can now create an object from it to store your results

    public String getName(){
        return name;
    }

    public List<LibraryItem> getBooksCheckedOut(){ //
         return booksCheckedOut; //cannot return something of different type than defined
        // in the method (e.g. cannot return number of books checked out
        // since its type would be int)
    }

    public double getFinesOwed() {
        return finesOwed;
    }

    public void checkOutItem(LibraryItem item, Date dueDate){
        booksCheckedOut.add(item);
        item.setDueDate(dueDate);
    }

    public void returnItem(LibraryItem item, Date returnDate){
        if(booksCheckedOut.contains(item)){
            booksCheckedOut.remove(item);
            double fine = item.calculateFine(returnDate);
            finesOwed += fine;
        }
    }

    public void payFine(double amount){
        finesOwed -= amount;
    }
}
