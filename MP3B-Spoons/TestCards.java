public class TestCards{
    public static void main(String[] args){
        // creates a card object that is the default ace of spades
        Card card1 = new Card();
        System.out.println(card1);

        // creates a card object that is the Jack of Diamonds 
        Card card2 = new Card(Card.JACK, Card.DIAMONDS);
        System.out.println(card2);

        // Test if the 2 cards are equal
        System.out.println(card1.equals(card2));

        // creates a 3rd card to test the copy constructor
        Card card3 = new Card(card1);
        System.out.println(card3.equals(card1));
        System.out.println(card3);

        // creats a default deck
        Deck deck = new Deck();
        System.out.println(deck.size());
        
        // tests the deal function of the deck class to get a card object.
        Card card = deck.deal();
        System.out.println(card);

        // creates a dealer with the default constructor
        Dealer dealer = new Dealer();

        // tests the deals function of the dealer class
        dealer.deals(15);
        System.out.println(dealer);

        // another test with more cards
        Dealer dealer2 = new Dealer();
        dealer2.deals(50);
        System.out.println(dealer2);
    }
}