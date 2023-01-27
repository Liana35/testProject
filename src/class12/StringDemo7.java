package class12;

public class StringDemo7 {
    public static void main(String[] args) {

        // CHECKS IF SMTH STARTS WITH A SPECIFIC LETTER  OTR ENDS WITH OR CONTAINS

        // input - string, output- boolean
        String str="I love java";
       // boolean startsWith=str.startsWith("I");
      //  System.out.println(startsWith);



        System.out.println(str.endsWith("java"));
        // only those methods can be chained which returns a String


        // Method chaining is when multiple methods are called on the same line
        System.out.println(str.toLowerCase().startsWith("i"));  // first converted and then checked

        // another method CONTAINS
        System.out.println(str.contains("java"));
    }
}
