package class4;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Homework2 {
    public static void main(String[] args) {
        double rate=3.5;
        int price=200001;
        int loan=195000;
         if(rate>4.5){
             System.out.println("User will not buy a house");
         }else {
             System.out.println("User will consider buying");
             if (price>200000){
                 System.out.println("User will take a loan");
             }else{
                 System.out.println("User will pay cash");
             }
             if(loan<=200000){
                 System.out.println("We will lend the money");
             }else{
                 System.out.println("We have to reject the client");
             }
        }
    }
}
