import java.util.ArrayList;
import java.util.Random;
public class Playlist extends Collections{

    // Overloaded Constructor
    public Playlist(String title){
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
    // add content method for podcast parameter
    public void addContent(Content content){
        super.addContent(content);
    } 

    // removeContent method for Song parameter
    public void removeContent(Content content){
        super.removeContent(content);
    }

    // shuffle method: picks a random content from the collection to play and returns the position of it in the given arraylist
    public static int shuffle(ArrayList<Content> queuedContent){
        Random randy = new Random();
        int num;
        if (queuedContent.size() > 1){
            num = randy.nextInt(queuedContent.size() - 1);
        }else{
            num = 0;
        }
        return num;
    }

    public void play(){
        ArrayList<Content> queuedContent = new ArrayList<Content>();
        queuedContent.addAll(this.contents); // creates a deep copy of the content into a seperate ArrayList acting as a queue
        int size = queuedContent.size();
        for (int i = 0; i < size; i++){
            int position = shuffle(queuedContent);
            queuedContent.get(position).playContent();
            if (queuedContent.get(position) instanceof Song){
                System.out.println("Playing \"" + queuedContent.get(position).getTitle() + "\" by " + queuedContent.get(position).getArtist().getName());
            }else{
                Podcast podcast = (Podcast)queuedContent.get(position);
                System.out.println("Playing \"" + queuedContent.get(position).getTitle() + "\" Episode " + podcast.getEpisode() + " by " + queuedContent.get(position).getArtist().getName());

            }
            queuedContent.remove(position); 
        }
    }
    // toString Method: converts class to string through parent class method
    public String toString(){
        return super.toString();
    }

}