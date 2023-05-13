import java.io.*;
import java.util.LinkedList;
import java.util.Random;
public class BabyNames{
    public static void main(String[] args){
        BufferedReader reader= null;
        PrintWriter writer = null;
        String file = args[0];
        String gender = args[1];
        LinkedList<String> maleNames = new LinkedList<String>();
        LinkedList<String> femaleNames = new LinkedList<String>();
        Random randy = new Random();
        try{
            if (args.length < 1){
                throw new InvalidArgumentsException("No arguments were given when running the program");
            }
            String[] filetype = file.split("\\.");
            System.out.println(filetype[0]);
            if (!(filetype[1].equals("csv"))){
                throw new IncompatibleExtensionException("That file you entered is not a .csv file!");
            }
            reader = new BufferedReader(new FileReader("./" + file));
            String currentLine;
            while ((currentLine = reader.readLine()) != null){
                String[] names = currentLine.split(",");
                if (names[1].equals("F")){
                    femaleNames.add(names[0]);
                }else{
                    maleNames.add(names[0]);
                }
            }
            writer = new PrintWriter(new FileWriter("./potential_names.txt"));
            int number;
            String name;
            for (int i = 0; i < 3; i++){
                if (gender.equals("F")){
                    number = randy.nextInt(femaleNames.size());
                    name = femaleNames.get(number);
                    writer.println(name + "," + gender);
                }else{
                    number = randy.nextInt(maleNames.size());
                    name = maleNames.get(number);
                    writer.println(name + "," + gender);
                }
            }
        }catch(InvalidArgumentsException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You did not enter an argument of a file type");
        }catch(IncompatibleExtensionException e){
            System.out.println(e.getMessage());
        }catch(FileNotFoundException e){
            System.out.println("We could not find that file");
        }catch(IOException e){
            System.out.println("Error reading from that file");
        }finally{
            if (writer != null){
                writer.close();
            }
            try{
                if (reader != null){
                    reader.close();
                }
            }catch(IOException e){
                System.out.println("Error when closing the file connection.");
            }
        }
        

    }
}