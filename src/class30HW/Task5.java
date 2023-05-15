package class30HW;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        /*
    Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
     */
        List<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(15);
        numbers.add(10);


        int sum=0;
        for(Integer b:numbers){
            sum+=b;
        }
        System.out.println(sum);


    }
}
