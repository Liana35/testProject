package class30HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
  /*       Create a map of Best Buy store. Place
        item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        Retrieve all keys and values from a Best Buy mInteger, ap using EntrySet.*/
        Map<Integer, String> bestBuy= new HashMap<>();

        bestBuy.put(7664847,"Printer");
        bestBuy.put(7879885,"Tv");
        bestBuy.put(7879555,"Loudspeaker");
        bestBuy.put(7874548,"Playstation");

       /* Set<Map.Entry<Integer, String>> entrySet= bestBuy.entrySet();
        for(Map.Entry<Integer,String> entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
*/
        var entrySet=bestBuy.entrySet();

        for(var entry:entrySet){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
