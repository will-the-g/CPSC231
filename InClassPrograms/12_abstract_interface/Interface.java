/* 
  INTERFACES
  Interfaces allow us to define a list of methods that must be implemented
  by any class that wants to implement our interface. 
  This is a convenient way to standardize the methods for objects with a similar function (think about how ArrayList and LinkedList both share the same methods - they both implement the List interface)
  Unlike extending a parent class, classes can implement multiple interfaces.
*/
public interface Rentable {
  /* 
  Our rentable interface allows us to standardize all objects
  present in a library-type program, where objects can be 
  checked out and then returned.
  Each object is able to decide *how* objects are checked in and out, and     whether or not the object is available or meets certain requirements.
  Both methods return a boolean representing whether or not the operation was a success.
  */
  public boolean checkIn();
  public boolean checkOut();
}