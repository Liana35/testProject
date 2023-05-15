package class29;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class MapDemo {
    public static void main(String[] args) {
       // LinkedHashMap - if we want to maintain the order
        // or TreeMap - to store alphabetically, according to keys

        HashMap<String, Integer> groceries= new HashMap<>();
        // its not  a part of collection framework
        groceries.put("Eggs".toLowerCase(), 10);  // Eggs is a key, 10 is index,  value
        groceries.put("Milk", 5);
        groceries.put("Bread", 5);
        groceries.put("Rice", 6);
        groceries.put("Meat", 7);
        groceries.put("Karaly", 5);

        System.out.println(groceries.get("Rice")); // we specify the key
        System.out.println(groceries);
        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        groceries.remove("Meat");
        System.out.println(groceries);


    }
}
