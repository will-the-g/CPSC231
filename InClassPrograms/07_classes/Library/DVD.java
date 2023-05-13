//Team 6 DVD
public class DVD{
    private String title;
    private String genre;
    private boolean isAvailable;
    // contructor
    public DVD(){
        this.title = "Rio";
        this.genre = "comedy";
        this.isAvailable = true;
    }
    public DVD(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public DVD(DVD DVDtoCopy);{
        this.title = DVDtoCopy.title;
        this.genre = DVDtoCopy.genre;
        this.isAvailable = DVDtoCopy.isAvailable;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    public String getGenre(){
        return this.genre;
    }
    public void setGenre(String newGenre){
        this.genre = newGenre;
    }
     public boolean isAvailable() {
        return this.isAvailable;
    }
    public void setAvailable(boolean newIsAvailable) {
        this.isAvailable = newIsAvailable;
    }
    publis String toString(){
        return "Title: " + this.title + "\nGenre: " + this.genre +
        "\nIs Available:" + this.isAvailable;
    }
    public void checkOut(){
        if (this.isAvailable){
            this.isAvailable = false;
            System.out.println(this.title + "is checked out.");
        }
        else
            System.out.println(this.title + "is not available.");
    }
    public void checkIn(){
        this.isAvailable = true;
    }
}