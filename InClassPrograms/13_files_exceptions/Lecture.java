import java.lang.ArithmeticException;

public class Lecture{
    // Letting everyone know that an ArithmeticException is possible
    // when running this method, so someone should handle it
    public static double divide(int a, int b) throws ArithmeticException {
        if (b == 0){
            // forcing the exception to occur
            throw new ArithmeticException("You cannot divide by Zero.");
        }else{
            return (double) a / b;
        }
    }
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        try{
            // execute this potentially errneous code
            // if it works move on like normal
            System.out.println(divide(a,b));
        } catch (ArithmeticException e){
            // if an ArithmeticException is thrown during the above block
            // this runs
            System.out.println(e.getMessage());
        }
        String[] games = {"Scarlet", "Violet"};
        
        try{
            if (args.length < 1){
                // forcing the exception to occur so the catch block will run
                throw new InvalidArgumentsException("No arguments were given when running the program");
            }
            // get the version of the game we are playing form the command line args
            // print out what version we are playing
            int GamePosition = Integer.parseInt(args[0]); // get the number from args as an int
            String gameVersion = games[GamePosition];
            System.out.println("You are playing the " + gameVersion + " pokemon game.");
        }catch(InvalidArgumentsException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You either did not provide any arguments, or you provided an argument greater than the number of game versions.");
        }catch(NumberFormatException e){
            System.out.println("Please enter the game version as a numner (0 or 1)");
        }
    }
}