public class Audiobook{

    private String title;
    private String author;
    private int runtimeMin;
    private boolean isAvailable;

    //default constructor 
    public Audiobook() {
        title = "Catcher in the Rye";
        author = "JD Salinger";
        runtimeMin = 150;
        isAvailable = true;
    }
    // overloaded constructor 
    public Audiobook(String title, String author, int runtimeMin) {
        this.title = title;
        this.author = author;
        this.runtimeMin = runtimeMin;
        this.isAvailable = true;
    }
    // Copy Constructor 
    public Audiobook(Audiobook audiobookToCopy) {
        this.title = audiobookToCopy.title; 
        this.author = audiobookToCopy.author;
        this.runtimeMin = audiobookToCopy.runtimeMin;
        this.isAvailable = audiobookToCopy.isAvailable;
    }

    //Accessors and mutators for the audiobooks properties 
    public String getTitle() {
        return this.title;
    }
    /** The Mutator for the title of the book
     * @param theTitle is for the newTitle string 
     */
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    /** Accessor for the author of the book
     * @return the String representation of the author
     */
    public String getAuthor() {
        return this.author;

    }
    /** The Mutator for the title of the book
     * @param newAuthor is for the String representation of the author 
     */
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;

    }

    /** Accessor for the runtime in Minutes of the book
     * @return the int representation of the runtime in minutes
     */
    public int getRuntimeMin() {
        return this.runtimeMin;

    }
    /** The Mutator for the audiobooks runtime in mins 
     * @param newAuthor is for the interger representation of the audiobook's runtime in minutes
     */
    public void setRuntimeMin(int newRuntimeMin) {
        this.runtimeMin = newRuntimeMin;

    }

    /** Accessor for the author of the book
     * @return the boolean representation for if the audiobook is available 
     */
    public boolean isAvailable() {
        return this.isAvailable;

    }
    /** The Mutator for the boolean representation of the availablity for a audiobook
     * @param available is for the new boolean represnetion of the audiobooks availabity 
     */
    public void setAvaialable(boolean available) {
        this.isAvailable = available;

    }


     /** Returns a tectual representation of our audiobook including 
     * all private member variables and a decorative border 
     * @ return the String of the textual representation 
     */
    public String toString() {// toString method 
        return this.title + " by " +this.author + ", Runtime (min): "+
        this.runtimeMin +
        "\n ******************\n" + 
        "Available to Rent: "+ this.isAvailable;

    // check out method 
    public void checkOut() {
        if (this.isAvailable == true) {
            this.isAvailable = false;
        }
        else {
            System.out.println("The audiobook is currently check out, we'll notify you when the audiobook is returned"); 

        }
    }
    // check in method
    public void checkIn() {
        this.isAvailable = true;
    }

    public static void main(String[] args) {
        Audiobook defaultAudiobook = new Audiobook();
        Audiobook wildWings = new Audiobook("Wild Wings", "Richard Powers",90);
        Audiobook copy = new Audiobook(wildWings);// deep copy - completely new object 
    }



}