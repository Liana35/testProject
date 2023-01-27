package class12;

public class StringDemo3 {
    public static void main(String[] args) {

        // CONCATENATION

        String firstName="Akhter";
        String lastName="Lava";
        String fullName= firstName+" "+lastName; // most widely used
        System.out.println(fullName);
        //or
        System.out.println(firstName+" "+lastName);
        //or - concat method
        System.out.println(firstName.concat(" "+lastName));


    }
}
