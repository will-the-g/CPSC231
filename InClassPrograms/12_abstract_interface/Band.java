import java.util.ArrayList;
import java.util.Collections;
public class Band {
  public static void main(String[] args) {
     // we cannot make an Instrument object because it is abstract
    //Instrument i = new Instrument();
    Guitar g = new Guitar();
    g.play();
    Drums d = new Drums();
    d.play();

    // we can still use an abstract class as our type in collections
    ArrayList<Instrument> band = new ArrayList<Instrument>();
    band.add(g);
    band.add(d);

    // here we have the temporary variable of type Instrument
    // but the subclass play methods are being called
    // (an example of polymorphism)
    for (Instrument i : band) {
      i.play();
    }

    g.checkOut();
    g.checkOut();
    g.checkIn();
    g.checkOut();

    Drums trap = new Drums(2);
    ArrayList<Drums> perc = new ArrayList<Drums>();
    perc.add(d);
    perc.add(trap);
    Collections.sort(perc);
    System.out.println(perc);
  }
}