package Review10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AllElementsFromSet {
    public static void main(String[] args) {
        Set<String> qaJobs= new LinkedHashSet<>();
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("API Tester");
        qaJobs.add("Database Tester");
        System.out.println(qaJobs);

        // how to get all values from a Set
        // 1- enhanced fro loop


        // right side we specify collection
        //Set<String> qaJobs -  So left is String
        for(String qa:qaJobs){
            System.out.print(qa);
        }


        // 2 - iterator
        //Iterator Interface has 3 methods: hasNext(); next(); remove();
        Iterator <String> it =qaJobs.iterator();

        while(it.hasNext()){ // if there is a next element - continue
            String element=it.next();
            System.out.print(element+"  ");
        }


    }
}
