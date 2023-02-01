package Class16HW;

public class Task3Vowels {

    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
// Method should be available inside the class only where it was declared and executed by calling it is name.

    private String word( String vowels){


       /* vowels=vowels.replaceAll("[^aeiouyAEIOUY]","");
        return vowels;
        */
        return vowels.replaceAll("[^aeiouyAEIOUY]","");



    }

    public static void main(String[] args) {

        Task3Vowels vowels= new Task3Vowels();
        System.out.println(vowels.word("Pinocchio"));

    }



}
