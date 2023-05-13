Name: Will Gatlin
ID: 2427413
Email: wgatlin@chapman.edu
Course: CPSC231-02
Assignment: MP3b: Spoons
Files: Card.java, Dealer.java, Deck.java, Driver.java, Game.java, Player.java, README.txt

Explanation of Program:
When the game constructor is called, the game is made. Along with the game there is a unique dealer assigned to it,
and a unique deck for that game. The play method of the game class starts the game. It loops through each player in the game.
First a player has a 33% chance to check if a spoon has been taken, if it has then the player takes a spoon. After that, the player
takes a card from the previous player (or the dealer in the case of player 1), and checks if that card is the one they are going for.
The check is happening in the player class in which an algorithm detects the highest frequency card in the player's hand. If the card 
is the one they are going for, they discard a random card in the their hand. If it isn't, then they give it to the next player. 
If a player recieves a match of 4 when they take the card, they take a spoon and discard the other card. Since this is all done 
in the player class, there is a short "if" statement to see if a spoon was taken during a turn. Once a card has been
discarded by the last player, it is put into an empty deck that is slowly filled with discards. Once the dealer runs out of cards
(assuming all the spoons haven't been taken) the discard deck is given to the dealer to repeat the whole process. After the number
of spoons has reached 0, it loops through the player's to see who doesn't have a spoon and outputs them as the loser.