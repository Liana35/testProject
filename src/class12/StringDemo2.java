package class12;

public class StringDemo2 {
    public static void main(String[] args) {

        // only CONVERTS UPPER CASE LETTERS TO LOWER CASE
        String str="Java is Fun";
        //str.toLowerCase();  // lower case method we call on str object
        String newStr=str.toLowerCase();
        System.out.println(newStr);


        // TO UPPER CASE
        String str2="i love java";
        String upperCaseLetter=str2.toUpperCase(); // upperCaseLetter - name of the object
        System.out.println(upperCaseLetter);

    }
}
