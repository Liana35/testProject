package ReplitsPR;

import java.util.*;

public class ReplMaps2 {
    public static void main(String[] args) {
        LinkedHashMap<String,String > studentsMap= new LinkedHashMap<>();
        studentsMap.put("Street","Patrick ST");
        studentsMap.put("Suite","265");
        studentsMap.put("City","Vienna");
        studentsMap.put("Zip","22180");
        studentsMap.put("Country","United State");

       /* Set<Map.Entry<String, String>> entrySet2= studentsMap.entrySet();
        var iterator = studentsMap.entrySet().iterator();
        while(iterator.hasNext()){
            var entry= iterator.next();
            System.out.println(entry.getValue());
        }*/

        Set<Map.Entry<String,String>> entrySet2= studentsMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = studentsMap.entrySet().iterator();
        while(iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getValue());
        }
    }
    }

