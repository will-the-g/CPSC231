public class Content implements Comparable<Content>{
    protected String title;
    protected Artist artist;
    protected int numPlays = 0;

    // Accessors
    public String getTitle(){
        return this.title;
    }
    public Artist getArtist(){
        return this.artist;
    }
    public int getPlays(){
        return this.numPlays;
    }


    // equals method 
    public boolean equals(Object o){
        if (!(o instanceof Content)){
            return false;
        }else{
            Content content = (Content)o;
            if (content.title.equals(this.title) && content.artist.equals(this.artist)){
                return true;
            }
            return false;
        }
    }
    public int compareTo(Content content){
        return this.numPlays - content.numPlays;
    }
    public void playContent(){
        this.numPlays += 1;
    }

    // toString Method
    public String toString(){
        return "Title: " + this.title
        + ", Artist: " + this.artist.toString()
        + ", Listens: " + this.numPlays;
    }
}