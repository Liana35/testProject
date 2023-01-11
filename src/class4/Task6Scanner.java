package class4;


import java.util.Scanner;

public class Task6Scanner {
     public static void main(String[] args) {
         Scanner name=new Scanner(System.in);
         System.out.println("How many years have you worked");
         int years=name.nextInt();
         System.out.println("What was your salary");
         int salary= name.nextInt();
         if (years>=5){
             System.out.println("You are eligible for a bonus");
             if(salary>=50000){
                 System.out.println("Your bonus is 5000");
             }else{
                 System.out.println("Your bonus is 3000");
             }
         }

     }
}
