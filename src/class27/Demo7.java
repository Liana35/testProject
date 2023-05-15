package class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {

        /*ArrayList<String> names=new ArrayList<>();
        names.add("Fizzy");
        names.add("Savo");
        names.add("Sam");
        names.add("Urwa");
        names.add("Tarik");
        names.add("Abeera");

        System.out.println(names.contains("Daria"));
        System.out.println(names);
        names.remove("Sam");
        System.out.println(names);
        names.set(3,"Sam");   // replace element on index 3 with another element(Sam)
        System.out.println(names);
        System.out.println(names.indexOf("Savo"));

        */

        ArrayList<String> names2=new ArrayList<>();
        names2.add("Artem");
        names2.add("Dima");
        names2.add("katya");
        names2.add("Ivan");

        System.out.println(names2);
        System.out.println(names2.contains("Dima"));
        names2.remove("Dima"); //or names2.remove(1);
        System.out.println(names2);
        names2.set(2,"Ivanka");   // replace index of element for String, name itself
        System.out.println(names2);
        System.out.println(names2.indexOf("Artem"));
      //  names2.clear();
     //   System.out.println(names2);





    }
}