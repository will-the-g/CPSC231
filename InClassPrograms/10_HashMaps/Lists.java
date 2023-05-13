import java.util.ArrayList;
import java.util.LinkedList;

public class Lists{
    public static void main(String[] args){
        /* 
        Collections
        - Allows us a more devloper friendly way to store multiple items
        - Several different data structures to choose from depending on the context of your project
        - Collections must hold objects
        */
        // creates a new ArrayList object using the default constructor
        // specifies that the ArrayList will hold integers
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(8); // ArrayLists are flexible in sie, so we do not need to specify
        nums.add(16);
        
        // removing items
        // nums.remove(0);
        // to remove the value with integers, you have to explicitly use the wrapper class
        // nums.remove(Integer.valueOf(16));

        System.out.println("Does 4 exist in the ArrayList? " + nums.contains(4));
        System.out.println("How many items are in the list? " + nums.size());
        System.out.println("What items is at position 0? " + nums.get(0));

        nums.add(12);
        nums.add(64);
        nums.add(16);

        // can loop throught ArrayLists like arrays
        for (int n : nums){
            System.out.println(n);
        }

        LinkedList<String> names = new LinkedList<String>();
        names.add("Katara");
        names.add("Prince Zuko");
        names.add("Aang");
        names.add(0, "Toph");
        System.out.println(names);

        names.remove(1);
        names.remove("Aang");
        System.out.println(names);

    }
}