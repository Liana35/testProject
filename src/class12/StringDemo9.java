package class12;

public class StringDemo9 {
    public static void main(String[] args) {


        // HOW MANY CHARS - LETTERS - NUMBERS

        String str="efhkr 45678 #$%%";
        int counter=0;
        for(int i=0; i< str.length(); i++){

            if(Character.isAlphabetic(str.charAt(i))){
                counter++;
            }

        }
        System.out.println("Total isAlphabetic in Str "+ counter);


        //if(Character.isDigit(str.charAt(i)))  - for numbers
        // if(Character.isAlphabetic(str.charAt(i)))

    }
}
