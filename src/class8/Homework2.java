package class8;
import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class Homework2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);


        for(int i= 1; i<=10; i++){
            System.out.println("Would you like to apply for a credit card?");
            boolean creditCard= scan.nextBoolean();
            if (!creditCard){
            }
            else{
                break;
            }


        }

    }
}