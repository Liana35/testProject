package Review10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
// set is a collection of unique elements
        //hashset doesn't maintain insertion order
        Set<String> qaJobs= new HashSet<>();
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("API Tester");
        qaJobs.add("Database Tester");
        System.out.println(qaJobs);

        qaJobs.remove("Manual Tester");
        System.out.println(qaJobs);
        qaJobs.add("API Tester");
        qaJobs.add("API Tester");
        System.out.println("Added duplicates "+qaJobs);


        // creating an Object and passing collection as a parameter to invoke parametrized constructor
      Set lset  =new LinkedHashSet<>(qaJobs);
      //LinkedHashSet preserves insertion order
     // lset.addAll(qaJobs); another way of adding qaJobs
        System.out.println("Linked hashSet = "+lset);


        // TreeSet sorts alphabetically , 1-100
        Set<String> tset=new TreeSet<>();
        tset.addAll(qaJobs);
        System.out.println("TreeSet = "+tset);





    }
}
