import java.util.ArrayList;
public class Album extends Collections{ 
    
    // Overloaded Constructor
    public Album(String title){
        this.title = title;
        super.contents = new ArrayList<Content>();
    }
    // Title Accessor
    public String getTitle(){
        return super.getTitle();
    }
    // contents accessor
    public ArrayList<Content> getContents(){
        return super.getContents();
    }
    // Adds song to ArrayList
    public void addSong(Content content){
        super.addContent(content);
    }

    public void removeSong(Content content){
        super.removeContent(content);
    }

    public void play(){
        ArrayList<Content> queuedContent = new ArrayList<Content>();
        queuedContent.addAll(this.contents); // creates a deep copy of the content into a seperate ArrayList acting as a queue
        int size = queuedContent.size();
        for (int i = 0; i < size; i++){
            queuedContent.get(0).playContent();  // plays the song, then removes it from the queued list.
            System.out.println("Playing \"" + queuedContent.get(0).getTitle() + "\" by " + queuedContent.get(0).getArtist().getName());
            queuedContent.remove(0);
        }
    }

    // toString Method: converts class to string through parent class method
    public String toString(){
        return super.toString();
    }
}