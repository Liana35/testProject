package PRJCTJava1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        System.out.println("Please enter numbers");
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
            sum = sum + numbers[i];
        }

        System.out.println("Sum of all elements is "+sum);

    }
}