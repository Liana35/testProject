package PRJCTJava1;

public class Task8 {
    public static void main(String[] args) {


            int num1 = 0, num2 = 1;
            System.out.println("The first 10 numbers of Fibonacci series");

            for (int i = 1; i <= 10; ++i) {
                System.out.print(num1 + " ");

                int num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
        }}
