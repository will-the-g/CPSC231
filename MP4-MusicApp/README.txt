Name: Will Gatlin
Class: CPSC231-01
Assignment: MP4-MusicApp
Files: Accounts.java, Album.java, Artist.java, Collections.java, Content.java
Driver.java, Listener.java, Playlist.java, Podcast.java, Song.java, favorites.txt, README.txt

Accounts Class: This class is the base/parent class for the Listener & Artist Classes

Album Class: Albums contain contents(ArrayList<Content>) and a title(String). It is derived from the Collections Class. Has accessors/mutators, toString Methods.
It is able to add & remove songs from the Arraylist through methods. The play method plays each song in the Album.
This is done by creating a seperate ArrayList acting as a queue, where songs are played then removed from the queue until it is empty.

Artist Class: contains the name of the artist(String). Derived from the Accounts Class. Has accessors/mutators, equals, and toString methods.

Collections Class: Base/parent class for the Album and Playlist Classes. Has title(String) and contents(ArrayList<Content>) as member variables.
Has accessors & toString Methods. Has add/remove methods to add/remove Content objects to/from the ArrayList. 
This class implements the comparable interface and has the compareTo method which compares objects based of the size of the collection.

Content Class: Is the base/parent class for the Song and Podcast classes. Has title(String), artist(of Artist class), and number of plays (int)

Driver Class: Implements the UI for the whole program. Has 6 cases for each option of the menu.

Listener Class: contains the name(String) and favorites(ArrayList<Content>). Has Accessors/Mutators. Users are able to add favorites to their list

Playlist Class: contains the title(String) and content(ArrayList<Content>) variables inherited from Collections class. Has accessors & toString Methods.
Implements the comparable interface, and has the compareTo method which returns an int based off the difference of listens between objects.
Has add/remove methods to add/remove Content from the arraylist. The play method creates a seperate arrayList acting as a queue in which it plays Podcasts
and songs randomly(using the shuffle method) until the queue is empty.

Podcast Class: contains the title(String), artist(Artist), numPlays(int), episode(int) member variables. Has Accessors/Mutators, equals, and toString Methods.
Has play method that increases the numPlays by 1.

Song Class: contains the title(String), artist(Artist), numPlays(int) member variables. Has Accessors/Mutators, equals, and toString Methods
Has play method that increases the numPlays by 1.


Architecture: I choose to use cases to make the code more readable, and had a method for each case to make sure variables and their references were only contained within their case.

Challenges: The biggest challenge I faced was making an algorithm to write out the songs/podcasts from favorites to a file in order of most listens.
I kept getting stuck in an infinite loop, but I realized the size kept updating inside the for loop so I had to declare a variable for size before the for loop.
Another challenge was taking integers from scanner input through a try/catch. If a string was entered it would catch it, but get stuck in an infinite loop. 
I realized I needed to clear the input with scnr.next() which fixed it.

Possible Additional Features: Some additional features could be having multiple accounts and having the log in to the account. Another thing could be saving the altered playlists to the listener account.
There's nothing to create your own playlists/albums so that could be added.
