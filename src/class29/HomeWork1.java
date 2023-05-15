package class29;

import java.util.LinkedHashSet;

public class HomeWork1 {
    public static void main(String[] args) {
        //Create a Set of cities in which you want to make sure that insertion order is maintained.
        // Then remove any city that starts with “A”;

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Kyiv");
        cities.add("Madrid");
        cities.add("Lisbon");
        cities.add("Antalya");
        cities.add("Amsterdam");

        cities.removeIf(city->city.contains("a")||city.contains("A"));
        System.out.println(cities);





    }
}
