public class Guitar extends Instrument {
  private int n_strings;

  public Guitar() {
    super("string");
    n_strings = 6;
  }

  public Guitar(int n_strings) {
    super("string");
    this.n_strings = n_strings;
  }

  /* Here we implement our abstract method from the parent to satisfy our agreement with the abstract class */
  public void play() {
    System.out.println("strum strum strum...");
  }
}
