package class29;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        // LinkedHashSet doesn't allow duplicates, retains the insertion order
        //HashSet is  faster than this one
        LinkedHashSet<String> fruit= new LinkedHashSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("Kiwi");
        fruit.add("Apple");

        System.out.println(fruit);

    }
}
