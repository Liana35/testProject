package class6;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month=scan.next();

        switch (month){
            case "June":
            case "june":
            case "july":
            case "July":
            case "August":
            case "august":
                System.out.println("You were born in summer");
                break;
            case "September":
            case "september":
            case"October":
            case"october":
            case"November":
            case"november":
                System.out.println("You were born in fall");
                break;
            case "December":
            case "december":
            case "January":
            case "january":
            case "February":
            case "february":
                System.out.println("You were born in winter");
                break;
            case "March":
            case "march":
            case "April":
            case "april":
            case "May":
            case "may":
                System.out.println("You were born in spring");
        }





    }
}