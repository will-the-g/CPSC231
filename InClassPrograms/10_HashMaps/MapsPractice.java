import java.util.HashMap;
import java.util.Scanner;
public class MapsPractice{
    public static void main(String[] args){
        HashMap<String, String> emojis = new HashMap<String, String>();
        emojis.put("fire","🔥");
        emojis.put("pineapple","🍍");
        emojis.put("drink","🍹");

        Scanner scnr = new Scanner(System.in);
        String sentence = scnr.nextLine();
        String[] words = sentence.split(" ");
        for (String word : words){
            if(emojis.containsKey(word)){
                word = emojis.get(word) + word + " ";
                System.out.print(word);
            }else{
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }
}