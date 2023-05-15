package Review10;

import java.util.LinkedList;
import java.util.List;

public class ReplitList {

    public static void main(String[] args) {

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        System.out.println(removeA(countries));
    }


    public static LinkedList<String> removeA(List<String> cnt) {

        cnt.removeIf(s -> s.startsWith("A"));


        return (LinkedList<String>) cnt;
    }


}