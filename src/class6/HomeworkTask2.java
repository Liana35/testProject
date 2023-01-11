package class6;

import java.util.Scanner;


  //Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday”,
// any day from 6-7 → output “It is a weekend”, any other day → output “Invalid day”

public class HomeworkTask2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What day is it?");
        int day=scan.nextInt();

      switch(day){
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
              System.out.println("It is a weekday");
              break;
          case 6:
          case 7:
              System.out.println("It is a weekend");
          default:
              System.out.println("Invalid day");
      }





    }
}