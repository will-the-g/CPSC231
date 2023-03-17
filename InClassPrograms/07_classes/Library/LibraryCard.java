public class LibraryCard{
    // Class variables
    private int id;
    private String slogan;
    private boolean active;
    private static int totalID;
    
    // deactive method
    public void deactivate(){
        this.active = false;
    }
    //Default Constructor
    public LibraryCard(){
        id = 100000 + totalID;
        slogan = "Beg, borrow, but please don’t steal. Return your books!";
        active = false;
        totalID++;
    }
    // Overload Constructor
    public LibraryCard(boolean active){
        this.active = active;
        this.id = 100000 + totalID;
        slogan = "Beg, borrow, but please don’t steal. Return your books!";
        totalID++;
    }
    //Copy Constructor
    public LibraryCard(LibraryCard cardToCopy){
        this.id = cardToCopy.id;
        this.active = cardToCopy.active;
        cardToCopy.deactivate();
        totalID++;
    }
    //Acessors & Mutators
    public int getId(){
        return this.id;
    }
    public String getSlogan(){
        return this.slogan;
    }
    public boolean getActive(){
        return this.active;
    }
    public void setActive(boolean active){
        this.active = active;
    }
    // toString()
    public String toString(){
        return "ID: " + this.id + ", Active: " + this.active
        + "\n" + this.slogan;
    }
    
    // testing
    public static void main(String[] args){
        LibraryCard card = new LibraryCard(false);
        card.setActive(true);
        System.out.println(card);
        card.deactivate();
        System.out.println(card);
        LibraryCard card2 = new LibraryCard();
        System.out.println(card2);
        for (int i = 0; i < 10; i++){
            LibraryCard card3 = new LibraryCard(true);
            System.out.println(card3);
        }
    }

}