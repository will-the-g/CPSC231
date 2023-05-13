public class Book {
    String title;
    String author;
    boolean isAvailable;
    /* Static member variables
     *  - instead of being unique to a specific instance of an object
     * it is shared amongst every instance of the class
     * - every single Book will share this value
     * - the final keyword makes the variable a constant 
     *  (so it cannot be changed after it is intialized)
     * 
     */
    public static final String genre = "YA Fiction";
    public static int booksOnPlatform = 0;
    // Default Constructor
    public Book(){
        title = "The color Purple";
        author = "Alice Walker";
        isAvailable = true;
        booksOnPlatform++;
    }
    // Overload Constructor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        booksOnPlatform++;
    }
    //Copy Constructor
    public Book(Book bookToCopy){
        this.title = bookToCopy.title; // bookToCopy.getTitle()
        this.author = bookToCopy.author;
        this.isAvailable = bookToCopy.isAvailable;
        booksOnPlatform++;
    }

    // shallow copy means a two objects share some references
    // deep copy means you create a competely new obhect with no shared references 



    public String getTitle(){
        return this.title;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
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
    // To string
    public String toString(){
        return this.title + " by " + this.author
        + "\n~~~~~~~~~~~~~~~~~~~~\n"
        + "Available to Rent: " + this.isAvailable; 
    }
    public boolean equals(Object o ){
        // see if Object is a book
        if (!(o instanceof Book)){
            return false; // not a book
        }else{
            // can be a book
            // type-cast our parameter o Object -> Book ("downcasting")
            Book other = (Book)o;
            return other.title.equals(this.title) 
            && other.author.equals(this.author);
        }

    }
    public static void main(String[] args){
        Book defaultBook = new Book();
        Book overstory = new Book("The overstory", "Richard Powers");
        System.out.println(defaultBook.equals(overstory));


        // overstory.setAvailable(false);

        // Book copy = new Book(overstory); // Deep copy - completely new object
        // Book notADeepCopy = overstory; // Shallow copy - new variable, points to same object
        // System.out.println(defaultBook);
        // System.out.println(overstory);
    }
}