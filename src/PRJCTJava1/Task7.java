package PRJCTJava1;


import java.util.Scanner;
public class Task7 {
    //Write a java program to check whether a given number is prime or not?
    //A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number to check if it is truly prime number or not: ");
        int number= scan.nextInt();
        int x=0;
        for (int i = 1; i <=number ; i++) {
            if (number%i==0){
                x=x+1;
            }
        } if (x>2){
            System.out.println(number + " is non-prime number");}
        else if (x<=1)
        {System.out.println(number +" is not greater than 1");}
        else
            System.out.println(number + " is a prime number");
    }

}



