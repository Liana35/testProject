package Review6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ReplitList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> obj= new ArrayList();
        obj.add(sc.nextInt());
        obj.add(sc.nextInt());
        obj.add(sc.nextInt());
        obj.add(sc.nextInt());
        obj.add(sc.nextInt());


        for(int i=0;i<obj.size();i++){
            System.out.print(obj.get(i)+" ");
        }

    }
}
