/** A representation of a physical Book within a library
program where books can be rented and returned.
Includes both hardback and paperback books. Each book
has its own title and author, and every Book is within the
Ya Fiction genre. */
public class Book {
    String title;
    String author;
    boolean isAvailable;

    public static final String genre = "YA Fiction";
    /** A running tally of how many books have been constructed */
    public static int booksOnPlatform = 0;
    /** Default constructor creates an Object of The Color Purple
    By Alice Walker. Books are immediately available after creation
     */
    public Book(){
        title = "The color Purple";
        author = "Alice Walker";
        isAvailable = true;
        booksOnPlatform++;
    }
    /** Overloaded Constructor accepts values for title and author
    @param title the title of the book
    @param author the author of the book (If multiple authors, pass in comma seperated String of names)
    
     */
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        booksOnPlatform++;
    }
    /** Copy Constructor creates a duplicate object for the given book
    @param bookToCopy the Book Object you'd like to duplicate
     */
    public Book(Book bookToCopy){
        this.title = bookToCopy.title; // bookToCopy.getTitle()
        this.author = bookToCopy.author;
        this.isAvailable = bookToCopy.isAvailable;
        booksOnPlatform++;
    }

    /** Accessor for the title of the book
    @return the String 
     */
    public String getTitle(){
        return this.title;
    }
    /** The mutator for the title of the book
    @param newTitle The new value for the string reprenseation of the title
     */
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    /** Accessor for the author of the book
    @return the string */
    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public boolean isAvailable(){
        return this.isAvailable;
    }
    public void setAvailable(boolean available){
        this.isAvailable = available;
    }
    public String toString(){
        return this.title + " by " + this.author
        + "\n~~~~~~~~~~~~~~~~~~~~\n"
        + "Available to Rent: " + this.isAvailable; 
    }

    /** Two Books are equal if they share the same title
    and author(s). Availability is not considered in the equality asessment.
    @param o the Object with which to compare a Book
    @return true if the Object is equal to this Book, false if not. */
    public boolean equals(Object o ){
        if (!(o instanceof Book)){
            return false;
        }else{
            Book other = (Book)o;
            return other.title.equals(this.title) 
            && other.author.equals(this.author);
        }

    }
}