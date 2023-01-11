package class4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner age=new Scanner(System.in);
        System.out.println("How old are you?");
        int age1= age.nextInt();
        if(age1>18){
            System.out.println("We will issue a driver's license for you.");

        } else {
            System.out.println("We will offer a lerner's permit instead");
        }


    }
}
