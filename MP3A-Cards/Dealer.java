import java.util.LinkedList;

public class Dealer{
    private Deck m_deck;
    // Default Constructor: creates a object for a dealer with a normal deck of cards
    public Dealer(){
        m_deck = new Deck();
    }
    // Deal Method: deals n cards from the deck and returns the deck without n cards
    public LinkedList<Card> deals(int n){
        LinkedList<Card> hand = new LinkedList<Card>();
        if (this.m_deck.size() != 0){
            for (int i = 0; i < n; i++){
                Card card = m_deck.deal();
                hand.add(card);
            }
            return hand;
        }else{
            LinkedList<Card> emptyhand = new LinkedList<Card>();
            return emptyhand;
        }
    }
    // Size Method: returns the size of the deck
    public int size(){
        return this.m_deck.m_cards.size();
    }
    // deckReplace Method: replaces the deck the dealer has to another deck.
    public void deckReplace(Deck deck){
        this.m_deck = deck;
    }
    // toString Method: returns the string representation of the deck
    public String toString(){
        return this.m_deck.m_cards.toString();
    }
    
}