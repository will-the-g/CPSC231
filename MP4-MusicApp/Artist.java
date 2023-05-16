public class Artist extends Accounts{


    // Overloaded Constructor
    public Artist(String name){
        this.name = name;
    }
    // Name Accessor
    public String getName(){
        return this.name;
    }
    // Name Mutator
    public void setName(String name){
        this.name = name;
    }

    // isEqual Method
    public boolean equals(Object o){
        if (!(o instanceof Artist)){
            return false;
        }else{
            Artist artist = (Artist)o;
            return artist.name.equals(this.name); 
        }
    }
    
    // toString Method: converts class to string by returning the name of the artist
    public String toString(){
        return this.name;
    }
}