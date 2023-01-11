package class6;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args){

        System.out.println("Please enter your grade");
        Scanner scan=new Scanner(System.in);
        char grade=scan.next().charAt(0);

        switch(grade){
            case 'A':
                System.out.println("Entered grade A =Excellent");
                break;
            case'B':
                System.out.println("B");
                System.out.println("Entered B=Good");
                break;
            case'C':
                System.out.println("entered C=Average");
                break;
            case'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }







    }
    }
