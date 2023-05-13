

/*
/*
This is our base class Wizard
(it is also sometimes called the parent class, or super class)
Member variables and methods defined here
will be inherited by any class that derives it, like a child inherits traits from their parents.
Syntax-wise, this is just a normal class. We don't have to specify that it will be inherited (we just do that in the derived class)
*/
public class Wizard {
  private String m_name;
  private int m_age;

  public Wizard() {
    m_name = "Harry Potter";
    m_age = 0;
  }

  public Wizard(String name, int age) {
    m_name = name;
    m_age = age;
  }

  public String getName() {
    return m_name;
  }

  public String toString() {
    return m_name + ", age " + m_age;
  }

  public void expelliarmus() {
    System.out.println("EXPELLIARMUS!!!!!");
  }

  public int expelliarmus(int n) {
    return 1;
  }

}
