package class28HM;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
       /* Create an ArrayList that will store 5 names into it.
                Find out whether the given ArrayList is empty or not?
                Check whether the specific name is present in an ArrayList or not?
                Find the size of your arrayList and print all values from that*/

        ArrayList<String> names=new ArrayList<>();
        names.add("Anya");
        names.add("Clarke");
        names.add("Finn");
        names.add("Octavia");
        names.add("Belammy");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Lina"));
        System.out.println(names.contains("Laura"));
        System.out.println(names.contains("Clarke"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
