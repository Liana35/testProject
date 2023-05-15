package ReplitsPR;

import java.util.*;

public class SetRepl {
    public static void main(String[] colors) {

        TreeMap<String,String > studentsMap= new TreeMap<>();
        studentsMap.put("1 item","apple");
        studentsMap.put("2 item","banana");
        studentsMap.put("3 item","pear");
        studentsMap.put("4 item","tomato");
        studentsMap.put("5 item","mango");
        studentsMap.put("6 item","kiwi");

        Set<Map.Entry<String, String>> entrySet= studentsMap.entrySet();
        for(Map.Entry<String,String> entry:entrySet){

            System.out.println("Key is "+entry.getKey()+" and value is "+entry.getValue());
        }


    }
}