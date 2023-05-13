import java.util.ArrayList;
public class InheritanceDriver{
    public static void main(String[] args){
        Wizard w = new Wizard();
        System.out.println(w);
        w.expelliarmus();

        HogwartsStudent harry = new HogwartsStudent();
        System.out.println(harry);

        HogwartsStudent cedric = new HogwartsStudent("Cedric Diggory", 20, "Hufflepuff");
        System.out.println(cedric);

        harry.expelliarmus();

        ArrayList<Wizard> wizards = new ArrayList<Wizard>();
        wizards.add(w);
        wizards.add(harry); // HogwartsSTudent i sbeing ccast up to a Wizard
        wizards.get(0).expelliarmus();
        wizards.get(1).expelliarmus();
    }
}