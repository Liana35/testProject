package class13;

public class StringDemo2 {
    public static void main(String[] args) {
        String str="HJGGFdjfkhdkjf754654%^&***";
        //replaces All upper case letters from A to K
        System.out.println(str.replaceAll("[A-K]","#"));
        //replaces All lower case letters from a to z
        System.out.println(str.replaceAll("[a-z]","#"));
        //replaces All lower case letters from 0 to 9
        System.out.println(str.replaceAll("[0-9]","#"));
        //replaces All lower case letters from A-Z and lower case letters from a-z
        System.out.println(str.replaceAll("[A-Za-z]","#"));  // more than one specification
        //replaces All upper case letters from A-Z and lower case letters from a-z and numbers as well
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));  // more than one specification
        //^ is not! - dont raplace [a-z] lower case a-z
        //Do not replace All lower case letters from A-Z and lower case letters from a-z
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));  // removes




    }
}
