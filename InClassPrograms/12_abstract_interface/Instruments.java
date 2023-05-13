
/* 
  This is our abstract class. 
  You can never create an instance of Instrument object, you must only create an instance of the sub-classes. 
The class allows you to abstract away shared values between the sub-classes and enforce methods that need to be implemented in the children.
We implement the Rentable interface to allow all children of instrument to be checked out from a musician's library.
*/
public abstract class Instrument implements Rentable {
  private String category;
  private boolean isAvailable;

  public Instrument() {
    category = "brass";
    isAvailable = true;
  }

  public Instrument(String category) {
    this.category = category;
    isAvailable = true;
  }

  /* 
    This is an abstract method, which has no implementation in the parent. The children must provide an implementation of the method play to be valid.
    Abstract methods do not have a method body
*/
  public abstract void play();

  /* 
    If we do not provide these methods, we violate our contract with
    the interface Rentable we are trying to implement and will get a compile error.
  */
  public boolean checkIn() {
    isAvailable = true;
    System.out.println("Thanks for checking it back in!");
    return true;
  }

  public boolean checkOut() {
    if (isAvailable) {
      System.out.println("Enjoy!");
      isAvailable = false;
      return true;
    } else {
      System.out.println("This item is not currently available.");
      return false;
    }
  }
  
}