package class29;

import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers= new TreeSet<>();
        // doesnt maintain the order, but sorts it by 1-100, a-z
        // doesnt allow duplicates
        // it is the slowest
        numbers.add(50);
        numbers.add(40);
        numbers.add(100);
        numbers.add(35);
        numbers.add(50);

        System.out.println(numbers);
    }
}
