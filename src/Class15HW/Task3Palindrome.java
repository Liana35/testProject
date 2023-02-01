package Class15HW;

public class Task3Palindrome {


    /*// wether String is Palidrome
   */ boolean word(String line){
        StringBuilder name= new StringBuilder(line);
        if (line.equals(name.reverse().toString())){
            return true;
        }else {
            return false;
        }}
        //second way




    public static void main(String[] args) {


        Task3Palindrome pal= new Task3Palindrome();
        String word2="ono";
        System.out.println(pal.word(word2));


    }


}
