package Class16HW;

public class Task2RevBuild {

    String reverseWord(String name){

        StringBuilder stringWord= new StringBuilder(name);
        stringWord.reverse();
        return stringWord.toString();

        //shorter way
      //  String reverseStr(String name1){
       //     return new StringBuilder(name1).reverse().toString();}



    }

    public static void main(String[] args) {
        Task2RevBuild line= new Task2RevBuild();

        System.out.println(line.reverseWord("Moca"));

    }



}
