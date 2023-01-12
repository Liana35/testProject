package class7;
import java.util.Scanner;
public class doWhile {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int number;
         do{
             System.out.println("Please enter a number");
             number=scan.nextInt();
         } while (number!=5);


        System.out.println("*****************************");


        int number2=5;

        while(number2!=5){
            System.out.println("Please enter a number");
            number2=scan.nextInt();
        }




    }

}
