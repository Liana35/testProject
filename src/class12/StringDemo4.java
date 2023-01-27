package class12;

import java.sql.SQLOutput;

public class StringDemo4 {
    public static void main(String[] args) {

        // EMPTY OR NOT

        String str="";
        System.out.println(str.isEmpty());// true if its empty


        String str2="ghhr";
        System.out.println(str2.isEmpty());// false if its full


        boolean isEmpty2=str.isEmpty();
        System.out.println(isEmpty2);

        System.out.println(str.isBlank()); // it wont count "  " spaces as letters so it will be true


    }
}
