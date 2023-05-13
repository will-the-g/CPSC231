public class Card{
    // Member Variables
    public static final int HEARTS = 0;
    public static final int SPADES = 1;
    public static final int CLUBS = 2;
    public static final int DIAMONDS = 3;

    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    private int value;
    private int suit;
    private static String[] cardName = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    private static String[] suitName = {"Hearts", "Spades", "Clubs", "Diamonds"};
    // Default Constructor: creates an object of the Ace of spades
    public Card(){
        value = ACE;
        suit = SPADES;
    }
    /* Overload Constructor: accepts values for value and suit
    Parameter value: the value of the card(2-King)
    Parameter suit: the suit of the card*/
    public Card(int value, int suit){
        this.value = value;
        this.suit = suit;
    }
    // Copy Constructor: creates a duplicate object for the given card
    // Parameter cardToCopy: the card that is being copied
    public Card(Card cardToCopy){
        this.value = cardToCopy.value;
        this.suit = cardToCopy.suit;
    }
    // toString() Method: String representation of the card
    public String toString(){
        return cardName[this.value - 2] + " of " + suitName[this.suit];
    }
    // Equals Method: Assume 2 cards are equal if their values are equal
    public boolean equals(Object o){
        if (!(o instanceof Card)){
            return false;
        }else{
            Card card = (Card) o;
            return this.value == card.value;
        }
    }
    // Accessor for value: returns the value of the card
    public int getValue(){
        return this.value;
    }
    // Mutator for value: sets the value of the card
    public void setValue(int value){
        this.value = value;
    }
    // Accessor for suit: returns the suit of the card
    public int getSuit(){
        return this.suit;
    }
    // Mutator for suit: sets the suit of the card
    public void setSuit(int suit){
        this.suit = suit;
    }

}