package class30HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class persontester {
    public static void main(String[] args) {
        TreeMap<Integer, person> human = new TreeMap<>(); // or just Map<Integer, person>  human= new TreeMap<>();
        // entrySet.add(new Entry(2,"Shah"));
        human.put(12, new person("Clarke", "Phillips", 22, 5000));
        human.put(11, new person("Sarah", "Simon", 25, 7000));
        human.put(22, new person("Bryan", "Andrews", 30, 5500));
        human.put(2, new person("Kristina", "Adams", 55, 8505));

       // Set<Map.Entry<Integer, person>> entrySet=human.entrySet();
        var entrySet5=human.entrySet();
        for(Map.Entry<Integer,person> entry:entrySet5){

            System.out.print(entry.getKey()+" ");
            entry.getValue().display();
        }

    }

}

