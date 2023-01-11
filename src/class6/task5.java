package class6;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        double number1= numbers.nextDouble();
        double number2=numbers.nextDouble();
        double number3=numbers.nextDouble();

        if(number1>number2&&number1>number3){
            System.out.println(number1+" is the largest");
        } else if(number2>number1&&number2>number3){
            System.out.println(number2+" is the largest");
        }else if(number3>number1&&number3>number2){
            System.out.println(number3+" is the largest");
        }

    }
}
