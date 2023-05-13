import java.util.Random;
import java.util.Scanner;

public class InClassExceptions{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        Random randy = new Random();
        String profanity[] = {"bad", "something", "profanity"};
        boolean quit = false;
        while (quit == false){
            String question = scnr.nextLine();
            try{
                for (int i = 0; i < profanity.length; i++){
                    if (question.equals(profanity[i])){
                        throw new ExplicitLanguageException("That is not very nice");
                    }
                }
            }catch(ExplicitLanguageException e){
                System.out.println(e.getMessage());
                quit = true;
            }
            int answer = randy.nextInt(2);
            if (answer == 0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }

    }
}