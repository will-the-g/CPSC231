import java.util.HashMap;


public class maps{
    public static void main(String[] args){
        HashMap<String, String> capitals = new HashMap<String, String>();
        System.out.println(capitals);

        capitals.put("TX", "Austin");
        capitals.put("NY", "Albany");
        System.out.println(capitals);

        capitals.put("NY", "Manhattan");
        System.out.println(capitals);

        String capitalOfTX = capitals.get("TX");

        System.out.println(capitals.containsKey("MI"));
        System.out.println(capitals.containsValue("Manhattan"));


        // loop through all keys or values in a HashMap
        // use .values() for values
        // use .keySet() for keys
        for (String state: capitals.keySet()){
            System.out.println("Key: " + state);
            System.out.println("The capital of " + state + " is " + capitals.get(state));

        }
    }
}

