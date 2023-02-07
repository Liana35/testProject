package class15;

public class Repl {


    boolean isEven(int num1, int num2) {
        boolean flag = false;
        if (num1 % 2 == 0 && num2 % 2 == 0) {
           flag= true;
        } else if (num1 % 2 != 0 || num2 % 2 != 0) {
            flag = false;


        } return flag;
    }

    public static void main(String[] args) {

        Repl why= new Repl();
        boolean isEven=why.isEven(12,12);
        System.out.println(isEven);



    }
}