package class12;

public class StringDemo5 {
    public static void main(String[] args) {

        //EQUAL METHOD

        String str ="Java";
        String str2="Java";
        boolean areEqual=str.equals(str2);
        System.out.println(areEqual);


        //IGNORE CASE
        boolean areEqaul2=str.equalsIgnoreCase(str2);
        System.out.println(areEqaul2);
       // input is string output is boolean
        // it is case sensitive
    }
}
