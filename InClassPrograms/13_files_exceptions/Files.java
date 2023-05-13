// Typically we do not use * imports because you import a bunch
// of extra stuff you don't use, but with file IO
// we are going to use most of the classes under java.io, so we use it here
import java.io.*;
import java.util.HashMap;
public class Files{
    public static void main(String[] args){
        // read in the contents of poem.txt
        // count the word counts for every word in the file
        // store that in a HashMap with word -> wordCount
        BufferedReader reader = null;
        PrintWriter writer = null;
        HashMap<String, Integer> wordCounts = new HashMap<String, Integer>();

        // since setting up file connections can throw IOExceptions (checked exceptions)
        // we have to open the connectiosn within a try/catch
        try{
            // create a bew BufferedReader object that holds a FileReader object with the path to our file
            // use a local path to the file we want to read in
            reader = new BufferedReader(new FileReader("./poem.txt"));
            String currentLine;

            while ((currentLine = reader.readLine()) != null){
                // once there is nothing left in the file. readLine() will return null
                // we want our loop to run as long as there is more lines to process
                String[] words = currentLine.split(" "); // turn each line into an array of strings of each word
                for (String word : words){
                    if (wordCounts.containsKey(word)){
                        // increment the count by 1
                        wordCounts.put(word, wordCounts.get(word) + 1);
                    }else{
                        wordCounts.put(word, 1);
                        // put the intial record of that word into the HashMap
                    }
                }

            }
            // setting up Writer is similar to setting up Reader
            // FileWriter constructor accepts two params. First is the path, second is a boolean of whether or not to append
            writer = new PrintWriter(new FileWriter("./output.txt", true));
            writer.println("Writing out a simple String!");

        }catch(FileNotFoundException e){
            // occurs when we put the wrong path and Java cannot find the file
            System.out.println("We could not find that file");
        }catch(IOException e){
            // something else breaks when trying to read the file contents
            System.out.println("Error reading from that file.");
        }finally{
            // will run after the try/catch blocks are done
            // need to close our file conenctions
            if (writer != null){
                writer.close(); // this does not a throw a checked exception
            }
            try{
                if (reader != null){
                    reader.close(); // ends the connection between our program and the file
                }
            }catch(IOException e){
                System.out.println("Error when closing the file connection.");
            }
        }
        System.out.println(wordCounts);
    }
}