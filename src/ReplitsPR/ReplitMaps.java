package ReplitsPR;

import java.util.*;

public class ReplitMaps {
    public static void main(String[] args) {
        //Using iterator retrieve all keys and values

        HashMap<String,Integer > studentsMap= new HashMap<>();
        studentsMap.put("mango",10);
        studentsMap.put("apple",30);
        studentsMap.put("orange",20);
        studentsMap.put("mango",40);
        studentsMap.put("mango",9);

        Set<Map.Entry<String, Integer>> entrySet2= studentsMap.entrySet();
        var iterator = studentsMap.entrySet().iterator();
        while(iterator.hasNext()){
            var entry= iterator.next();
            System.out.println("Key = "+entry.getKey()+" and value = "+ entry.getValue());
        }
    }
    }

