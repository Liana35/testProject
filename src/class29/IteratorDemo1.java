package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList <Double> numbers= new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
        /*numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.3);
*/


        // 1st way, not to do it, not always proper
       /* for(Double number:numbers){
            if(number>11){
                numbers.remove(number);
            }
        }*/
        // second option
      /*  numbers.removeIf(numberX -> numberX >11);   // numberX is a variable name ,  we can come up with any name
        System.out.println(numbers);*/

      // 3d
        // getting an object of iterator
       Iterator<Double> iterator= numbers.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(numbers);
// hasNext return true as long as there are elements left to be iterated

        while(iterator.hasNext()){
          double number=  iterator.next();
          if(number>11){
              iterator.remove();
          }
        }
        System.out.println(numbers);


    }
}
