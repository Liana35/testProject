package class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task {
    public static void main(String[] args) {
        TreeMap<String, String>  countries= new TreeMap<>(); // or just Map<String, String>  countries= new TreeMap<>();
        countries.put("France", "Paris");
        countries.put("Ukraine", "Kyiv");
        countries.put("Spain", "Madrid");
        countries.put("Czech republic ", "Prague");
        countries.put("Hungary ", "Budapest");








     // Set<Map.Entry<String, String>> entrySet2= countries.entrySet();
      //  or below is the faster way
        var entrySet2= countries.entrySet();
      // for(Map.Entry<String,String> entry:entrySet2){
        for(var entry:entrySet2){
           System.out.println(entry.getKey()+" "+entry.getValue());
    }



        // with iterator
        var iterator = countries.entrySet().iterator();
        while(iterator.hasNext()){
           var entry= iterator.next();
            System.out.println(entry.getValue()+" "+ entry.getValue());
            }
        }

}
