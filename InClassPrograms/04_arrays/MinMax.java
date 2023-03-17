
import java.util.Random;
public class MinMax {
    public static void main(String[] args){
        Random rand = new Random();
        int minimum = Integer.parseInt(args[0]);
        int maximum = Integer.parseInt(args[1]);
        int number = rand.nextInt(maximum - minimum + 1) + minimum;
        System.out.println(number);
    }
}
