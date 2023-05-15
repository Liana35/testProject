package class29;

import java.util.HashMap;

public class HomeWork2 {
    public static void main(String[] args) {
          /*
        Create a Set collection that will hold Objects of Student Type.
         In this set we do not care about the insertion order.
         Each student object should have name and studentID.
          Display name of each student.
         */

        HashMap<Integer,String> students= new HashMap<>();
        students.put(22, "Bryan");
        students.put(50, "Olivia");
        students.put(15, "George");
        students.put(10, "Eliza");
        students.put(22, "Bill");
        System.out.println(students.keySet()); // print the key(22,50 etc here)
        System.out.println(students.values()); // print the value/ index - names here

       /* for(Object v:students.keySet()){
            System.out.println(students.get(v));
        }*/

    }
}
