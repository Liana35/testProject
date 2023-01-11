package class6;

import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int number1=scan.nextInt();
        int number2=scan.nextInt();
        System.out.println("Please enter an operator");
        char operator=scan.next().charAt(0);

        if(operator=='+'){
            System.out.println("The result is "+(number1+number2));
        }else if(operator=='-'){
            System.out.println("The result is "+(number1-number2));
        }else if(operator=='/'){
            System.out.println("The result is "+(number1/number2));
        }












    }
}
