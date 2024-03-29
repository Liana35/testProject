package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MapsDemo7 {
    public static void main(String[] args) {
        Map<Integer, String> studentsMap= new HashMap<>();
        studentsMap.put(1,"Nazir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Gul");
        studentsMap.put(6,"Bahar");
        studentsMap.put(7,"Saba");


        // remove the entries if the key is greater than 2 and value contains letter i

        Set<Entry<Integer, String>> entrySet= studentsMap.entrySet();
        for(Entry<Integer,String> entry:entrySet){
           // System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            // or
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        entrySet.removeIf(x->x.getKey()>2&& x.getValue().contains("i"));
    }
}
