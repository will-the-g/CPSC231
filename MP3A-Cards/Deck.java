import java.util.LinkedList;
import java.util.Random;

public class Deck{
    public LinkedList<Card> m_cards;

    // Default Constructor: creates a normal deck of cards, one unique card of every suit and value combination
    public Deck(){
        m_cards = new LinkedList<Card>();
        for (int i = 0; i < 4; i++){
            for (int j = 2; j < 15; j++){
                Card card = new Card(j, i);
                m_cards.add(card);
            }
        }
    }
    // Copy Constructor: creates a duplicate object of the given deck
    public Deck(Deck deckToCopy){
        this.m_cards = deckToCopy.m_cards;
    }
    // toString() Method: returns a string representation of the deck
    public String toString(){
        return this.m_cards.toString();
    }
    // Size Method: returns the number of cards in the deck
    public int size(){
        return this.m_cards.size();
    }
    // Deal Method: removes a random card from the deck and returns the card
    public Card deal(){
        Random randy = new Random();
        int number = randy.nextInt(this.m_cards.size());
        Card card = this.m_cards.get(number);
        this.m_cards.remove(number);
        return card; 
    }
    
}