package class29;

import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
       /* Create a Set collection in which you need to add names of the countries.
        In this set we want all objects to be sorted in alphabetical order.
                Using 2 different ways retrieve all elements from set.*/

        TreeSet<String> countries= new TreeSet<>();
//there's no get method, you cant get a single element based on index
        countries.add("Spain");
        countries.add("Portugal");
        countries.add("Iceland");
        countries.add("England");

        System.out.println(countries);

        for (String s:countries){
            System.out.println(s);
        }



    }
}
