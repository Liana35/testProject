package ReplitsPR;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RTMaps {
    public static void main(String[] args) {
        HashMap<String,String> map= new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");


        System.out.println("HashMap Before Remove :");
        Set<Map.Entry<String, String>> entrySet2= map.entrySet();
        // for(Map.Entry<String,String> entry:entrySet2){
        for(var entry:entrySet2){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("------------------");
        map.remove("ONE");
        map.remove("FOUR");

        System.out.println("HashMap After Remove :");
        for(var entry:entrySet2){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
