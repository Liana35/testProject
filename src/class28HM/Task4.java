package class28HM;

import java.util.ArrayList;

public class Task4 {

       // Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
       public static void main(String[] args) {
           ArrayList<String> drinks=new ArrayList<>();
           drinks.add("Lemonade");
           drinks.add("Tea");
           drinks.add("Smoothie");
           drinks.add("Mojito");
           drinks.add("Sprit");

           for (int i = 0; i < drinks.size(); i++) {
               String drink = drinks.get(i);
               if (drink.contains("e") || drinks.contains("a")) {
                   drinks.set(i, "Water");
               }
           }
           System.out.println(drinks);

       }
    }