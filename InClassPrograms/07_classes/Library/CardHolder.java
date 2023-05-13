public class CardHolder {
    private String first;
    private String last;
    private LibraryCard libraryCard;
    private int audiobooks;
    private int dvds;

    public CardHolder() {
        first = "Anni";
        last = "Brown";
        audiobooks = 0;
        dvds = 0;
    }

    public CardHolder(String first, String last, int audiobooks, int dvds) {
        this.first = first;
        this.last = last;
        this.audiobooks = audiobooks;
        this.dvds = dvds;
    }

    public CardHolder(CardHolder cardHolderToCopy) {
        this.first = cardHolderToCopy.first;
        this.last = cardHolderToCopy.last;
        this.audiobooks = cardHolderToCopy.audiobooks;
        this.dvds = cardHolderToCopy.dvds;
    }

    public String getFirst() {
        return this.first;
    }

    public void setFirst(String newFirst) {
        this.first = newFirst;
    }

    public String getLast() {
        return this.last;
    }

    public void setLast(String newLast) {
        this.last = newLast;
    }

    public int getAudiobooks() {
        return this.audiobooks;
    }

    public void setAudiobooks(int newAudiobooks) {
        this.audiobooks = newAudiobooks;
    }

    public int getDvds() {
        return this.dvds;
    }

    public void setDvds(int dvds) {
        this.dvds = newDvds;
    }

    public String toString() {
        return this.first + " " + this.last
        + "\nAudiobooks: " + this.audiobooks
        + "\nDVDs: " + this.dvds;
    }

    public void checkOut(Audiobook book) {
        if (this.audiobooks > 2) {
            System.out.println("Max audiobooks already reached :(")
        } else {
            this.audiobooks++;
        }
    }

    public void checkOut(DVD dvd) {
        if (this.dvds > 0) {
            System.out.println("Max dvds already reached :(")
        } else {
            this.dvds++;
        }
    }

    public void checkIn(Audiobook book) {
        Audiobook isAvailable = true;
    }

    public void checkIn(DVD dvd) {
        DVD isAvailable = true;
    }
}