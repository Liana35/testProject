package class6;

public class WhileLoop {
    public static void main(String[] args) {

        int number = 1;
        if (number < 3) {
            System.out.println("Hello world");
        }
        number++;
        if (number < 3) {
            System.out.println("Hello planet");
        }
        number++;
        if (number < 3) {
            System.out.println("Hello universe");
        }

        int number2=0;
        while(number2<3){
            System.out.println("Hello");
            number2++;
        }
    }
}
