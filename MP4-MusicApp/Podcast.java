public class Podcast extends Content{
    private int episode;

    // Overloaded Constructor
    public Podcast(String title, Artist artist, int episode){
        this.title = title;
        this.artist = artist;
        this.episode = episode;
        this.numPlays = 0;
    }

    // Accessors
    public String getTitle(){
        return super.getTitle();
    }
    public Artist getArtist(){
        return super.getArtist();
    }
    public int getPlays(){
        return super.getPlays();
    }
    public int getEpisode(){
        return this.episode;
    }
    // Mutators
    public void setTitle(String title){
        this.title = title;
    }
    public void setArtist(Artist artist){
        this.artist = artist;
    }
    public void setEpisode(int episode){
        this.episode = episode;
    }
    public void playContent(){
        super.playContent();
    }

    // isEqual Method
    public boolean isEqual(Object o){
        if (!(o instanceof Podcast)){
            return false;
        }else{
            Podcast podcast = (Podcast)o;
            return super.equals(podcast)
            && podcast.episode == this.episode; 
        }
    }

    // toString Method: Converts class to string through the parent method
    public String toString(){
        return super.toString() + ", Episode: " + this.episode;
    }
}