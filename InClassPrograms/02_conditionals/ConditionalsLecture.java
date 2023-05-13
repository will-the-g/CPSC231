
import java.util.Scanner;
import java.util.Random;

public class ConditionalsLecture {
    public static void main(String[] args){
        /*
        String FAVORITE_DOG = "Golden Retriver";
        String guess = "Corgi";
        if (guess.equals(FAVORITE_DOG)){
            System.out.println("You guessed it!");
            
        }else if (guess.equals("Border Collie")){
            System.out.println("Nope, but close!");
        }else{
            System.out.println("Nope, you are wrong.");
        }

        
         * Switch statement:
         * - can only use it with bytes, chars, shorts, ints, or Strings
         

         switch (guess){
            case "Border Collie":
                System.out.println("Nope, but cliose!");
                break;
            case FAVORITE_DOG:
                System.out.println("Youg uess it!");
                break;
            default:
                System.out.println("nope, you're wrong!");
        */


        Scanner userInput = new Scanner(System.in);
        Random randy = new Random();
        int generated = randy.nextInt(2);
        System.out.println(generated);
        switch (generated){
            case 0:
                System.out.println("Magic 8 ball says: Yes");
                break;
            case 1:
                System.out.println("Magic 8 ball says: No");
                break;
            default:
                System.out.println("Error");
        }

    }
}
