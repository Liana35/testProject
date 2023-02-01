package PRJCTJava1;

public class Task8 {
    public static void main(String[] args) {


        //Fibonacci numbers
            int num1 = 0, num2 = 1;
            System.out.println("The first 10 numbers of Fibonacci series");

            for (int i = 1; i <= 10; ++i) {
                System.out.print(num1 + " ");

                int num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }

//another way
        int a = 0, b = 1;
            int c;

            for(int i=1;i<10;i++){

                c=a+b;// addition
                System.out.println(c+" ");
                a=b;//reassignment
                b=c;


            }




        }}
