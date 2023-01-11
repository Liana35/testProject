package class6;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int number1 = numbers.nextInt();
        int number2 = numbers.nextInt();
        int number3 = numbers.nextInt();


        if (number1 > number2)
            if (number1 > number3) {
                System.out.println(number1 + " is the largest");
            }
            if (number2 > number1)
                if (number2 > number3) {
                    System.out.println(number2 + " is the largest");
                } else {
                    System.out.println(number3 + " is the largest");
                }


            }
        }

