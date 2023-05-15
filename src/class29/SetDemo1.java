package class29;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {

        //HashSet does not allow duplicate values and it doesn't maintain insertion order
        HashSet<String> fruit = new HashSet<>();
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Mango");
        System.out.println(fruit);


    }
}
