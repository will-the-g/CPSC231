
import java.util.ArrayList;
import java.util.Collections;

public class Driver{
    Drums d = new Drums();
    d.play();
    Guitar g = new Guitar();
    g.play();


    g.checkOut();
    g.checkIn();
    d.checkOut();
    d.checkIn();
    



    ArrayList<Drums> drumline = new ArrayList<Drums>();
    drumline.add(new Drums(3));
    drumline.add(new Drums(1));
    drumline.add(new Drums(7));
    drumline.add(new Drums(5));
    System.out.println(drumline);
    Collections.sort(drumline); // sprts our ArrayList according to the compareTo method
    System.out.println(drumline);
}