package class6;
import java.util.Scanner;

public class TheLargestNumber {
    public static void main (String []args ){

        Scanner number=new Scanner (System.in);
        System.out.println("Please enter 3 numbers");
        int num1,num2,num3;

        num1= number.nextInt();
        num2=number.nextInt();
        num3=number.nextInt();

        if (num1>num2&&num1>num3){
            System.out.println(num1+" is the largest");
        }
        else if(num2>num1&&num2>num3){
            System.out.println(num2+" is the largest");
        }
        else if (num3>num1&&num3>num2){
            System.out.println(num3+" is the largest");
        }



    }
}
