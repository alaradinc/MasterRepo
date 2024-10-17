import java.util.Date;

public abstract class LibraryItem {
    private final String title;
    private final String author;
    private final String isbn;
    private final int publicationYear;



    private Date dueDate;

//    public LibraryItem(){ //default constructor not necessary because whenever you want
//                           //   to create a book object you have to specify its inputs' therefore a default class is
//                          //    not applicable)
//        this.title = "NA";
//        this.author = "NA";
//        this.isbn = "NA";
//        this.publicationYear = 0;
//    }
    public LibraryItem(String title, String author, String isbn, int publicationYear){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }
    public Date getDueDate() {
        return dueDate;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public abstract void getType();
                                //must create a new object of book type (or another type) within the main class to call it
    public String getTitle(){ // you have to use an object to be able to call this method (e.g.'book.getTitle')
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getISBN(){
        return isbn;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public double calculateFine(Date returnDate) {
        long timePassed = returnDate.getTime() - dueDate.getTime();
        if(timePassed > 0){
            return (timePassed/(8.64*Math.pow(10,7))) * 20; //$20 fine per day
        }
        return 0;
    }

    @Override
    public String toString() {
        return title + ":" + author;
    }
}
