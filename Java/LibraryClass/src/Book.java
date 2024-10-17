public class Book extends LibraryItem {

    //constructor (which is also a special method type)
    public Book(String title, String author, String isbn, int publicationYear) {
        super(title, author, isbn, publicationYear);
    } //sends all the inputs to the super class and uses its constructor to come up with the answers

    @Override
    public void getType() {
        System.out.println("Book");
    }
}
