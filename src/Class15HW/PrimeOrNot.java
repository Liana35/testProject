package Class15HW;

public class PrimeOrNot {
    public static void main(String[] args) {
        int number = 5;
        boolean flag = true;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % 2 == 0) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        System.out.println(number+" is prime "+flag);
    }
}
