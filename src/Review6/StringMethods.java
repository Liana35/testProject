package Review6;

public class StringMethods {
    public static void main(String[] args) {
        String str="Hello";


        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(1));

        String newString=str.concat("friends");
        System.out.println(newString);

        System.out.println(str);


        //checks if length is more than 0;
         boolean empty=str.isEmpty();
        System.out.println(empty);


        String str1=" Review B15  ";
        String newStr1=str1.trim();
        System.out.println(newStr1);



    }
}
