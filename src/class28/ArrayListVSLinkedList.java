package class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {
    public static void main(String[] args) {


        //Array list - 113170 because its add, its better for linked
        //linkedList= 216 ms
        long startTime= System.currentTimeMillis();
        LinkedList<String> numbers= new LinkedList<>();
        for(int i=0;i<100000;i++){
            numbers.add(0,"Test data");
        }

        long endtime=System.currentTimeMillis();
        System.out.println(endtime-startTime);

    }
}
