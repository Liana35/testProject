package PRJCTJava1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String[] countries= new String[5];
        String[] capital= new String[5];


        for (int i = 0; i < countries.length; i++) {
            System.out.println("Please enter countries");
            countries[i] = scan.next();
            System.out.println("Please enter the capitals");
            capital[i]=scan.next();
        }for(int j=0; j<5; j++){
            System.out.println("The capital of "+countries[j]+" is "+capital[j]);
        }




    }}
