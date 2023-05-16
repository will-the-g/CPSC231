import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.*;
public class Driver{
    private static ArrayList<Collections> collections = new ArrayList<Collections>();
    private static Listener account;
    private static boolean accountMade = false;
    private static ArrayList<Song> songList = new ArrayList<Song>();
    private static ArrayList<Podcast> podcastList = new ArrayList<Podcast>();
    // Option 1 Method
    public static void caseOne(){
        Scanner scnr1 = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scnr1.nextLine();
        account = new Listener(name);
        accountMade = true;
    }
    public static void caseTwo(){
        for (int i = 0; i < collections.size(); i++){
            System.out.println(collections.get(i).toString());
        }
    }
    public static void caseThree(){
        Scanner scnr3 = new Scanner(System.in);
        System.out.println("Which playlist would you like to add to? ");
        // Prints out the name of all collections with the class of playlist in the collections array list
        for (Collections collection : collections){
            if (collection instanceof Playlist){
                System.out.print(collection.getTitle() + ", ");
            }
        }
        System.out.println();
        String playlistToAdd = scnr3.nextLine();
        int count = 0;
        for (Collections collection : collections){
            // checks if the string that the user entered is one of the playlists in the collection list
            if (playlistToAdd.equals(collection.getTitle()) && (collection instanceof Playlist)){
                System.out.println("Would you like to add a song or podcast?");
                String answer = scnr3.nextLine();
                if (answer.equals("song")){
                    System.out.println("What is the name of the song you would like to add? ");
                    String songName = scnr3.nextLine();
                    System.out.println("What is the name of the artist of the song? ");
                    String artistName = scnr3.nextLine();
                    Artist artist = new Artist(artistName);
                    Song newSong = new Song(songName, artist);
                    int count1 = 0;
                    // Loops through all of the songs made so far
                    // if the song is already in the songList, it adds the song object inside the list to the playlist
                    for (Song song : songList){
                        if (song.equals(newSong)){
                            int countSongPlaylist = 0;
                            for (Content content : collection.getContents()){
                                if (content.equals(song)){
                                    System.out.println("This song is already in the playlist");
                                }else{
                                    countSongPlaylist += 1;
                                }
                            }
                            if (countSongPlaylist == collection.getContents().size()){
                                collection.addContent(song);
                                System.out.println("Song added!");
                            }

                        }else{
                            count1 += 1;
                        }
                    }
                    // if the song isn't in the songList, it adds the new song object to the songList and the playlist
                    if (count1 == songList.size()){
                        songList.add(newSong);
                        collection.addContent(newSong);
                        System.out.println("New Song added!");
                    }
                }else if(answer.equals("podcast")){
                    System.out.println("What is the name of the podcast you would like to add?");
                    String podcastName = scnr3.nextLine();
                    System.out.println("What is the name of the artist of the podcast");
                    String artistName = scnr3.nextLine();
                    System.out.println("What episode what you like to add?");
                    int episode = 0;
                    while(true){
                    try{
                        System.out.println("What episode of the podcast.");
                        episode = scnr3.nextInt();
                        break;
                    }catch(InputMismatchException e){
                        System.out.println("Please enter an integer");
                    }
                    }
                    Artist artist = new Artist(artistName);
                    Podcast newPodcast = new Podcast(podcastName, artist, episode);
                    int count2 = 0;
                    // Loops through all of the podcasts made so far
                    // if the podcast is already in the list, it adds the podcast object inside the list to the playlist
                    int countPodcastPlaylist = 0;
                    for (Podcast podcast : podcastList){
                        if (podcast.equals(newPodcast)){
                            for (Content content : collection.getContents()){
                                if (content.equals(podcast)){
                                    System.out.println("This podcast is already in the playlist");
                                }else{
                                    countPodcastPlaylist += 1;
                                }
                            }
                            if (countPodcastPlaylist == collection.getContents().size()){
                                collection.addContent(podcast);
                                System.out.println("Podcast added!");
                            }
                        }else{
                            count2 += 1;
                        }
                    }
                    // if the podcast isn't in the podcastList, it adds the new podcast object to the podcastList and the playlist
                    if (count2 == podcastList.size()){
                        podcastList.add(newPodcast);
                        collection.addContent(newPodcast);
                        System.out.println("New Podcast added!");
                    }
                    
                }else{
                    System.out.println("That is not an option!");
                }
            }else{
                count += 1;
            }
        }
        if (count == collections.size()){
            System.out.println("That playlist does not exist! ");
        }

    }
    public static void caseFour(){
        Scanner scnr4 = new Scanner(System.in);
        System.out.println("Which playlist or album would you like to play? ");
        for (Collections collection : collections){
            System.out.print(collection.getTitle() + ", ");
        }
        System.out.println();
        String collectionToPlay = scnr4.nextLine();
        int count = 0;
        for (Collections collection: collections){
            if (collectionToPlay.equals(collection.getTitle())){
                if (collection instanceof Playlist){
                    Playlist playlist = (Playlist)collection;
                    playlist.play();
                }
                if (collection instanceof Album){
                    Album album = (Album)collection;
                    album.play();
                }
            }else{
                count += 1;
            }
        }
        if (count == collections.size()){
            System.out.println("That playlist does not exist! ");
        }


    }

    public static void caseFive(){
        if (accountMade == true){
            Scanner scnr5 = new Scanner(System.in);
            System.out.println("Would you like to add a song or podcast?");
            String option = scnr5.nextLine();
            if (option.equals("song")){
                int count1 = 0;
                System.out.println("What is the name of the song");
                String songName = scnr5.nextLine();
                System.out.println("What is the artist of the song");
                String artistName = scnr5.nextLine();
                Artist artist = new Artist(artistName);
                Song newSong = new Song(songName, artist);
                // Loops through all of the songs made so far
                // if the song is already in the songList, it adds the song object inside the list to the playlist
                for (Song song : songList){
                    if (song.equals(newSong)){
                        int countSongFavorites = 0;
                        // loops through all of the favorites to see if it is already in the favorites
                        for (Content content : account.getFavorites()){
                            if (content.equals(song)){
                                System.out.println("This song is already in favorites");
                            }else{
                                countSongFavorites += 1;
                            }
                        }
                        if (countSongFavorites == account.getFavorites().size()){
                            account.addFavorites(song);
                            System.out.println("\"" + songName + "\" by " + artistName + " added!");
                        }

                    }else{
                        count1 += 1;
                    }
                }
                // if the song isn't in the songList, it adds the new song object to the songList and the playlist
                if (count1 == songList.size()){
                    songList.add(newSong);
                    account.addFavorites(newSong);
                    System.out.println("\"" + songName + "\" by " + artistName + " added!");
                }                 
            }else if(option.equals("podcast")){
                int count1 = 0;
                System.out.println("what is the name of the podcast.");
                String podcastName = scnr5.nextLine();
                System.out.println("What is the name of the artist of the podcast.");
                String podcastArtist = scnr5.nextLine();
                int episode = 0;
                while(true){
                    try{
                        System.out.println("What episode of the podcast.");
                        episode = scnr5.nextInt();
                        break;
                    }catch(InputMismatchException e){
                        System.out.println("Please enter an integer");
                        
                    }
                    scnr5.next(); // clears input if not an int
                }
                Artist artist = new Artist(podcastArtist);
                Podcast newPodcast = new Podcast(podcastName, artist, episode);
                // Loops through all of the podcasts made so far
                // if the podcast is already in the podcastList, it adds the podcast object inside the list to favorites
                for (Podcast podcast : podcastList){
                    if (podcast.equals(newPodcast)){
                        int countPodcastFavorites = 0;
                        // loops through all of the favorites to see if it is already in the favorites
                        for (Content content : account.getFavorites()){
                            if (content.equals(podcast)){
                                System.out.println("This podcast is already in favorites");
                            }else{
                                countPodcastFavorites += 1;
                            }
                        }
                        if (countPodcastFavorites == account.getFavorites().size()){
                            account.addFavorites(podcast);
                            System.out.println("\"" + podcastName + "\" Episode " + episode + " by " + podcastArtist + " added!");
                        }

                    }else{
                        count1 += 1;
                    }
                }
                // if the podcast isn't in the podcastList, it adds the new podcast object to the podcastList and favorites
                if (count1 == podcastList.size()){
                    podcastList.add(newPodcast);
                    account.addFavorites(newPodcast);
                    System.out.println("\"" + podcastName + "\" Episode " + episode + " by " + podcastArtist + " added!");
                }     
            }else{
                System.out.println("That is not an option!");
            }
        }else{
                System.out.println("Account has not been made yet! Please make an account to add favorites.");
            }
    }
    public static void caseSix(){
        if (accountMade == true){
            PrintWriter writer = null;
            ArrayList<Content> orderedContent = new ArrayList<Content>();
            if (account.getFavorites().size() > 0){
                try{
                    System.out.println(account.getFavorites());
                    writer = new PrintWriter(new FileWriter("./favorites.txt"));
                    // First populates the new arraylist with the first content in the favorites list
                    if (orderedContent.size() == 0){
                        orderedContent.add(account.getFavorites().get(0));
                    }
                    // The next content in the favorites list is compared to each content in the arraylist. If it has more listens,
                    // then the content is put in the spot of content it is bigger/equal than, which pushes everything else back.
                    for (int i = 1; i < account.getFavorites().size(); i++){
                        int countOrdered = 0;
                        int size = orderedContent.size();
                        for (int j = 0; j < size; j++){
                            if (orderedContent.get(j).compareTo(account.getFavorites().get(i)) <= 0){
                                orderedContent.add(j, account.getFavorites().get(i));
                                break;
                            }else{
                                countOrdered += 1;
                            }
                        }
                        if (countOrdered == size){
                            orderedContent.add(account.getFavorites().get(i));
                        }
                    }
                    // after a seperate arraylist is ordered based off num of listens, the content's information is written out to the file
                    for (int i = 0; i < orderedContent.size(); i++){
                        writer.println(orderedContent.get(i));
                    }
                    System.out.println("Exported favorites to the ./favorites.txt file");
                }catch(FileNotFoundException e){
                    System.out.println("File failed to open");
                }catch(IOException e){
                    System.out.println("Error reading from that file");
                }finally{
                    if (writer != null){
                        writer.close();
                    }
                }
            }else{
                System.out.println("You have no songs or podcasts in your favorites!");
            }
        }else{
            System.out.println("Account has not been made yet! Please make an account to add favorites.");
        }
    }
    public static void main(String[] args){
        // Default Artist & Songs & Podcasts
        Artist avicii = new Artist("Avicii");
        Artist joe = new Artist("joe");
        Song theNights = new Song("The Nights", avicii);
        songList.add(theNights);
        Song withoutYou = new Song("Without You", avicii);
        songList.add(withoutYou);
        Song theDays = new Song("The Days", avicii);
        songList.add(theDays);
        Song heyBrother = new Song("Hey Brother", avicii);
        songList.add(heyBrother);
        Podcast upcomingEdmEp1 = new Podcast("Upcoming EDM", joe, 1);
        podcastList.add(upcomingEdmEp1);
        // Default Albums
        Album theDaysNights = new Album("The Days/Nights");
        collections.add(theDaysNights);
        theDaysNights.addSong(theNights);
        theDaysNights.addSong(theDays);
        // Default Playlist
        Playlist playlist = new Playlist("Avicii playlist");
        collections.add(playlist);
        playlist.addContent(theNights);
        playlist.addContent(withoutYou);
        playlist.addContent(theDays);
        playlist.addContent(heyBrother);
        playlist.addContent(upcomingEdmEp1);

        String options = "\n1. Create a listener account\n"
            + "2. List all Playlists and Albums and their contents\n"
            + "3. Add songs to an existing playlist\n"
            + "4. Shuffle an existing Playlist or listen to an Album\n"
            + "5. Add a song or podcast to favorites\n"
            + "6. Export all of a listener’s favorites out to a file in ascending order by times streamed\n"
            + "7. Exit ";

        int option = -1;
        System.out.println("Welcome to the music app! Start off by creating a listener account!");
        
        while (option != 7){
            Scanner scnr = new Scanner(System.in);
            System.out.println(options);
            try{
                option = scnr.nextInt();
            }catch(InputMismatchException e){ // catchs if the user enters something that isn't an integer
                option = -1;
                // no need for print statement since the default of the case statement does that
            }
            switch (option) {
                case 1:
                    caseOne();
                    break;
                case 2:
                    caseTwo();
                    break;
                case 3:
                    caseThree();
                    break;
                case 4:
                    caseFour();
                    break;
                case 5:
                    caseFive();
                    break;
                case 6:
                    caseSix();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Please enter a number 1 through 7.");
                    break;
            }
        }

    }
}

