import java.util.ArrayList;
import java.util.Random;

public class Collections implements Comparable<Collections>{
    protected String title;
    protected ArrayList<Content> contents;

    // title accessor
    public String getTitle(){
        return this.title;
    }
    // contents accessor
    public ArrayList<Content> getContents(){
        return this.contents;
    }
    // removes a piece of content from the collection
    public void removeContent(Content content){
        for (int i = 0; i < this.contents.size(); i++){
            if (this.contents.get(i).equals(content)){
                this.contents.remove(i);
            }
        }
    }

    // adds a piece of content to the collection
    public void addContent(Content content){
        this.contents.add(content);
    }

    
    
    // CompareTo Method: Returns the an integer based off the difference of sizes of arraylists
    public int compareTo(Collections other){
        return this.contents.size() - other.contents.size();
    }

    // toString Method: converts class to string
    public String toString(){
        String returningString = this.title + "\n---------------------------";
        for (int i = 0; i < this.contents.size(); i++){
            returningString += "\n" + this.contents.get(i).toString();
        }
        return returningString + "\n";
    }

}