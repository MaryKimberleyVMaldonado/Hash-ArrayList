import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

// This is for HashMaps Class (Collection of key-value pairs).

public class IterateHashA {

    public static void main(String[] args) { 
       
        // Create an ArrayList and a HashMap.
         ArrayList<String> list = new ArrayList<>();
         HashMap<String, Integer> map = new HashMap<String, Integer>(); // Object of type HashMap.

        // Inserting 3 object into it.
        System.out.println("\n");
        // ArrayList.
        list.add("Engeener.");
        list.add("Designer.");
        list.add("Teacher.");

        // HashMap.
        map.put("Humberto", 30);
        map.put("Nicole", 21);
        map.put("Natasha", 18); 


        System.out.println("\t ArrayList: ");
        // Iterate over each collection and print each object.
        for (String i : list) {
            System.out.println(i);
        }

        System.out.println("\t HashMap: ");

         // System.out.println(map.get("Humberto")); I'm obtaining the value of the key "Humberto" that is 30.

        Set<String> keys = map.keySet(); 
        for (String key : keys) { // For each: sintax --> (type var : collection).
            System.out.println("Name: " + key + " Age: " + map.get(key));
        }
      
    }
}
