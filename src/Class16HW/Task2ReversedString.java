package Class16HW;

public class Task2ReversedString {
    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.


     String reverseStr4 (String input){

        String newStr1 ="";

        for(int i= input.length()-1; i>=0; i--){
            newStr1+=input.charAt(i);

        }
         return newStr1;
    }

    public static void main(String[] args) {
        Task2ReversedString word1= new Task2ReversedString();
        String line="Hola";

        System.out.println(word1.reverseStr4(line));

    }



}
