package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo6 {
    public static void main(String[] args) {
        Map<Integer, String> studentsMap= new HashMap<>();
        studentsMap.put(1,"Nazir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Gul");
        studentsMap.put(6,"Bahar");
        studentsMap.put(7,"Saba");

        Collection<String> values= studentsMap.values();
        System.out.println(values);

        // remove all values which contain letter "i"

        values.removeIf(city->city.contains("i"));
        System.out.println(studentsMap);

        // remove the entries if the key is greater than 2 and value contains letter i

    }
}
