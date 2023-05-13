import java.util.Random;

public class HogwartsStudent extends Wizard {
    String house;
    boolean playsQuidditch;
    public static String[] houses = { "Gryffindor", "Ravenclaw", "Slytherin", "Hufflepuff" };
    public static final Random randy = new Random();

    public HogwartsStudent(){
        // the first line of our constructors in the child class
        // must construct the part using super
        super(); // Wizard()
        playsQuidditch = false;
        int randomIndex = randy.nextInt(houses.length);
        house = houses[randomIndex];

    }

    public HogwartsStudent(String name, int age, String house){
        // the overloaded constructor for the child
        // can accept and set values for the parent
        super(name, age);
        this.house = house;
        this.playsQuidditch = false;
    
    }

    public String toString(){
        return "Name: " + super.getName() + "\nHouse: " +
        this.house + "\nOn Quidditch Team: " + this.playsQuidditch;
    }

    public void expelliarmus(){
        System.out.println("That spell is not allowed here...");
    }
}