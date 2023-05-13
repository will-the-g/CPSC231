import java.util.Random;
import java.util.LinkedList;
public class Game{
    private Player[] players;
    private Dealer dealer;
    private static int nSpoons;
    private int numPlayers;

    // Default Constructor
    public Game(){
        this.dealer = new Dealer();
        this.players = new Player[4];
        for (int i = 0; i < 4; i++){
            Player player = new Player(i, dealer);
            this.players[i] = player;
        }
        this.nSpoons = 3;
        this.numPlayers = 4;
    }
    // Overloaded Constructor
    public Game(int numPlayers){
        this.dealer = new Dealer();
        this.players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++){
            Player player = new Player(i, dealer);
            this.players[i] = player;
        }
        this.nSpoons = numPlayers - 1;
        this.numPlayers = numPlayers;
    }
    // play method
    public int play(){
        while (this.nSpoons > 0){
            LinkedList<Card> dealtcard = dealer.deals(1); // Dealer deals first card
            Card card = dealtcard.get(0);
            for (int i = 0; i < this.numPlayers; i++){ // loops through each player
                Random randy = new Random();
                int num = randy.nextInt(3);
                if (num == 1){
                    if (this.nSpoons < (this.numPlayers - 1)){ // if the number of spoons is less than the number of players - 1 then the player noticed a spoon was taken
                        if (this.players[i].hasSpoon() == false){
                            this.players[i].stealSpoon();
                            this.nSpoons -= 1;
                            System.out.println("Player " + i + " stole a spoon!");
                        }
                    }
                }
                boolean spoonCheck; // checks if a player has a spoon before the turn
                if (this.players[i].hasSpoon() == false){
                    spoonCheck = false;
                }else{
                    spoonCheck = true;
                }
                
                card = this.players[i].takeTurn(card); // Each player looks at card and takes their turn

                if ((this.players[i].hasSpoon() == true) && (spoonCheck == false)){ // if the player didn't have a spoon before the turn, but has one after, then they got a match and the nSpoons is decremented by 1.
                    this.nSpoons -= 1;
                    System.out.println("Player " + i + " got a match!");
                }
                if (nSpoons == 0){ // if the number of spoons is 0, the while loop breaks, and the game is over
                    break;
                }
                System.out.println((i + 1) + " took their turn." + this.players[i].getHand() + ". Has Spoon: " + this.players[i].hasSpoon() + ". NumOfSpoons: " + this.nSpoons);
            }
            Deck discardDeck = new Deck();
            for (int i = 0; i < 52; i++){
                Card trashcard = discardDeck.deal(); // empties the Deck created by the default constructor
            }
            discardDeck.m_cards.add(card); // adds the discarded card to the deck
        
            if (this.dealer.size() == 0){
                this.dealer.deckReplace(discardDeck); // if there are no more cards in the dealer's deck, it replaces it with the discard deck.
            }

        }
        // Once all the spoons have been taken, whoever doesn't have the spoon is returned as the player number who lost.
        for (int i = 0; i < this.numPlayers; i++){ 
            if (this.players[i].hasSpoon() == false){
                return i;
            }
        }
        return 0;
    }
    // GetPlayers Accessor 
    public Player[] getPlayers(){
        return this.players;
    }
    // GetDealer Accessor
    public Dealer getDealer(){
        return this.dealer;
    }
    // GetSpoons Accessor
    public int getSpoons(){
        return this.nSpoons;
    }

}