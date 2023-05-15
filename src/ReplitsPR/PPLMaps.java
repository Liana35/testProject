package ReplitsPR;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PPLMaps {
    public static void main(String[] args) {

        // print values in Upper case
        HashMap<String,String > studentsMap= new HashMap<>();
        studentsMap.put("Street","Patrick ST");
        studentsMap.put("Suite","265");
        studentsMap.put("City","Vienna");
        studentsMap.put("Zip","22180");
        studentsMap.put("Country","United State");



        Set<Map.Entry<String, String>> entrySet2= studentsMap.entrySet();
        // for(Map.Entry<String,String> entry:entrySet2){
        for(var entry:entrySet2){
            System.out.println(entry.getValue().toUpperCase());
        }
    }
}
