package Review6;

import java.util.ArrayList;
import java.util.LinkedList;

public class Replit183 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList();


        for (int i = 50; i <= 100; i++) {
            numbers.add(i);
        }

      /*  for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 3 != 0) {
                numbers.remove(i);
            }
        }  System.out.println(numbers);*/

        for (int i = numbers.size() - 1; i >= 0; i--) {
            int num = numbers.get(i);
            if (num % 3 != 0) {
                numbers.remove(i);
            }
        }

      /*  int i=0;
        while(i<numbers.size()){
            if (numbers.get(i) % 3 != 0){
                numbers.remove(i);
            }
            i++;
        }System.out.println(numbers);*/
        System.out.println(numbers);

    }
}