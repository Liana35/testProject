package class28HM;



import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
       // Create an arrayList of words. Remove every word that ends with “e”.

        ArrayList<String> words= new ArrayList<>();
        words.add("Apple");
        words.add("Pear");
        words.add("Cherry");
        words.add("Cantaloupe");
        words.add("Strawberry");

       words.removeIf(s -> s.endsWith("e"));
        System.out.println(words);

      /*  for(int i=0; i<words.size();i++){
            if(words.get(i).endsWith("e")){
                words.remove(i);
            }
            System.out.println(words);
        }*/

    }
}
