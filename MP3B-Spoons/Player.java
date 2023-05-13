import java.util.LinkedList;


public class Player{
    private int playerNumber;
    private boolean spoon;
    private int numSpoons;
    private int numPlayers = numSpoons + 1;
    private int numMatches = 1;
    private int matchedCard;
    private LinkedList<Card> playerHand;

    // Overload Constructor
    public Player(int playerNumber, Dealer dealer){
        this.playerNumber = playerNumber;
        this.playerHand = dealer.deals(4);
        this.spoon = false;
    }
    // Other Overload Constructor
    public Player(int playerNumber, LinkedList<Card> hand){
        this.playerNumber = playerNumber;
        this.playerHand = hand;
        this.spoon = false;
    }
    // Steal Spoon Method
    public void stealSpoon(){
        this.spoon = true;
    }
    // takeTurn Method: receives the card the is passed from the player and returns a card that will be passed along
    public Card takeTurn(Card card){
        // adds card to hand
        this.playerHand.add(card);
        // Gets the number of the card that appears most frequently in your hand
        int max_count = 0;
        for (int i = 0; i < playerHand.size(); i++){
            int count = 0;
            for (int j = 0; j < playerHand.size(); j++){
                if (playerHand.get(i).getValue() == playerHand.get(j).getValue()){
                    count++;
                }
            }
            if (count > max_count){
                this.numMatches = count;
                max_count = count;
                this.matchedCard = playerHand.get(i).getValue();
            }
        }
        // if the highest frequency is 1, then it sets the matchedCard as 0
        if (this.numMatches == 1){
            this.matchedCard = 0;
        }
        // If the highest frequency is 4, it grabs a spoon
        if ((this.numMatches == 4) && (this.spoon == false)){
            stealSpoon();
        }
        // Removes the card that is not the most frequent
        int count2;
        if (card.getValue() != matchedCard){ // if the card is not equal to matched card it passes it to next person
            return card;
        }else{
            for (int i = 0; i < playerHand.size(); i++){
            if (playerHand.get(i).getValue() != matchedCard){ // if card is equal to matched card, it finds one that isn't equal and passes it along
                Card returnCard = playerHand.get(i);
                playerHand.remove(i);
                return returnCard;
                }
            }
        }
        
        return card;
    }
    // GetPlayerNum Accessor
    public int getPlayerNum(){
        return this.playerNumber;
    }
    // GetHand Accessor
    public LinkedList<Card> getHand(){
        return this.playerHand;
    }
    // hasSpoon Accessor
    public boolean hasSpoon(){
        return this.spoon;
    }
    // hasSpoon Mutator
    public void setSpoon(boolean spoon){
        this.spoon = spoon;
    }

}