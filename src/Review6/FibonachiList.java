package Review6;

import java.util.LinkedList;

public class FibonachiList {
    public static void main(String[] args) {
        LinkedList<Integer> num=new LinkedList<>();

        num.add(0);
        num.add(1);

        int previous = 0;
        int current = 1;
        for (int i = 2; i < 10; i++) {
            int next = previous + current;
            num.add(next);
            previous = current;
            current = next;
        }
        for (int x : num) {
            System.out.print(x + " ");
        }

    }
}
