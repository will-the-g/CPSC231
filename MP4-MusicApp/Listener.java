import java.util.ArrayList;
public class Listener extends Accounts{
    private ArrayList<Content> favorites;
    // Overloaded Constructor
    public Listener(String name){
        this.name = name;
        favorites = new ArrayList<Content>();
    }
    // Name Accessor
    public String getName(){
        return this.name;
    }
    // Name Mutator
    public void setName(String name){
        this.name = name;
    }
    // Favorites Accessor
    public ArrayList<Content> getFavorites(){
        return this.favorites;
    }
    // adds a piece of content to the favorites list
    public void addFavorites(Content content){
        this.favorites.add(content);
    }
    
}