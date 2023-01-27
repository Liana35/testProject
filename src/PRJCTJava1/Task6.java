package PRJCTJava1;

public class Task6 {
    public static void main(String[] args) {

        // swap  2 numbers without a temporary variable
        int a= 10;
        int b= 20;

        System.out.println("Number a equals to "+a);
        System.out.println("Number b equals to "+b);
        a=a-b;
        b=a+b;
        a=b-a;

        System.out.println("Number a equals to "+a);
        System.out.println("Number b equals to "+b);



    }}
