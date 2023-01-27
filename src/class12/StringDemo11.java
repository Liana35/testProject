package class12;

public class StringDemo11 {
    public static void main(String[] args) {

        // PRINT OUTPUT FROM # INDEXES
        String str="Send it to support channel. More Java";
        String newStr= str.substring(28);  // int is the input
        System.out.println(newStr);    // output is a string

        // we can also specify the START POINT and the END POINT
        System.out.println(str.substring(0,27));
    }
}
