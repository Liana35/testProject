package Review6;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> alist=new ArrayList<>();
        // to store values inside an arrayList
        alist.add(12);
        alist.add(13);
        alist.add(14);

        // how to find size of my ArrayList

       int size= alist.size();
        System.out.println("The size of the array list is "+size);
        // to access
      int firstElement= alist.get(0);
        System.out.println(firstElement);

        alist.set(0,120);

        firstElement=alist.get(0);
        System.out.println(firstElement);
        //remove elements
        alist.remove(2);
        System.out.println(alist);
    }
}
