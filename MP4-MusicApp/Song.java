public class Song extends Content{

    //Overloaded Constructor
    public Song(String title, Artist artist){
        this.title = title;
        super.artist = artist;
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

    // Mutators
    public void setTitle(String title){
        this.title = title;
    }
    public void setArtist(Artist artist){
        this.artist = artist;
    }

    // Plays the Song 1 time, increasing the number of plays
    public void playContent(){
        super.playContent();
    }

    // isEqual Method
    public boolean equals(Object o){
        if (!(o instanceof Song)){
            return false;
        }else{
            Song song = (Song)o;
            return super.equals(song);
        }
    }
    
    // toString Method: Converts class to string through parent class method
    public String toString(){
        return super.toString();
    }
}