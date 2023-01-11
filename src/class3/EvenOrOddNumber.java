package class3;

import java.sql.SQLOutput;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        int number = 127;
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else if (number % 2 == 1) {
            System.out.println("The number is odd");
        }
    }
}
