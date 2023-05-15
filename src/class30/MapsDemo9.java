package class30;

import java.util.TreeMap;
// print all values using for each lopp and iterator
public class MapsDemo9 {
    public static void main(String[] args) {
        TreeMap<String, String> countries= new TreeMap<>(); // or just Map<String, String>  countries= new TreeMap<>();
        countries.put("France", "Paris");
        countries.put("Ukraine", "Kyiv");
        countries.put("Spain", "Madrid");
        countries.put("Czech republic ", "Prague");
        countries.put("Hungary ", "Budapest");

     var values= countries.values();
     for(var value:values){
         System.out.println(value);
     }
     var iterator2= countries.values().iterator();
     while(iterator2.hasNext()){
         var value= iterator2.next();
         System.out.println(value);
     }
    }
}
