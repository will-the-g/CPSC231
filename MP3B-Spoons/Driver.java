public class Driver{
    public static void main(String[] args){
        Game game = new Game();
        int loser = game.play();
        System.out.println("Player " + loser + " lost the game");
        Game game = new Game(6);
        int loser2 = game.play();
        System.out.println("Player " + loser2 + " lost the game");
    }
}