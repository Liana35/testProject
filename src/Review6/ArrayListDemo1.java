package Review6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        List<String> computers1= new ArrayList<>();
        computers1.add("Macbook Pro");
        computers1.add("HP");
        computers1.add("Lenovo");
        computers1.add("Dell");


        System.out.println(computers1);

        for(int i =0; i<computers1.size(); i++){
          String c= computers1.get(i);
            System.out.println(c+" ");
        }
        System.out.println("-----------------------");


        for(String comp:computers1){
            System.out.print(comp);
        }
    }

}
