import java.util.HashMap;
import java.util.Scanner;
public class MapsPractice2{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        HashMap<String, String> celebrities = new HashMap<String, String>();
        celebrities.put("The Rock", "therock@iscooking.com");
        System.out.println("Give a celebrity name");
        String celebrity = scnr.nextLine();
        if (celebrities.containsKey(celebrity)){
            System.out.println(celebrities.get(celebrity));
        }else{
            System.out.println("There is no email for this celebrity, please add one");
            String email = scnr.nextLine();
            celebrities.put(celebrity, email);
        }

    }
}