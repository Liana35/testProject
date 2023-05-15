package class30HW;

import java.util.LinkedHashSet;

public class Task4 {
    public static void main(String[] args) {
       /* Create the collection that will store single uniques Objects of a String type in which order is preserved.
        Write a logic to concatenate all string from the collection.
         */
        LinkedHashSet<String> words= new LinkedHashSet<>();
        words.add("Apple");
        words.add("Pear");
        words.add("Plump");
        words.add("Orange");


        for(String obj:words){
            System.out.print(obj+" ");
        }


       /* String fullStr="";
        for(String s:words){
            fullStr+=s+" ";
        }
        System.out.println(fullStr);
*/
    }
}
