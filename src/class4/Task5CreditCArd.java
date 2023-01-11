package class4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task5CreditCArd {
    public static void main(String[] args) {
        Scanner line1 =new Scanner(System.in);
        System.out.println("Do you have a credit card?");
       boolean credit=line1.nextBoolean();
       if(credit){
           System.out.println("What is the balance on your card?");
       }else{
           System.out.println("Would you like to open a new card?");
       }
       int balance=line1.nextInt();
       if(balance>1000){
           System.out.println("Pay it off immediately");
       }else{
           System.out.println("You can spend more");
       }
    }
}
