package Review6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class replit191 {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);


        Iterator <Integer> it =num.iterator();
        int sum=0;
        while(it.hasNext()){ // if there is a next element - continue
            Integer element=it.next();
            sum+=element;
        }
        System.out.println("Result of sum is "+sum);
        }
    }
