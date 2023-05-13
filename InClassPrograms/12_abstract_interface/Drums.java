/* 
  The Java Comparable interface allows us to define
  how Objects of our class should be ranked/ordered
  If we implement this, we can use other handy Java methods like
  Collections.sort() to order collections of our objects
  (without implementing Comparable, Java will not implicitly know how to order them)
*/
public class Drums extends Instrument implements Comparable<Drums> {
  private int n_pieces;

  public Drums() {
    super("percussion");
    this.n_pieces = 5;
  }

  public Drums(int n_pieces) {
    super("percussion");
    this.n_pieces = n_pieces;
  }

  public void play() {
    System.out.println("badum pschhh");
  }

  public String toString() {
    return n_pieces + " piece kit";
  }

  /*
   * compareTo should always take in another Object
   * and return an integer:
   * - 0 if the two items are equivalent
   * - negative number if this object is less than other
   * - positive number if this object is greater than other
   */
  public int compareTo(Drums other) {
    // if this Drums has more pieces, it will be positive
    // (and therefore greater than the other Drums)
    return this.n_pieces - other.n_pieces;
  }
}