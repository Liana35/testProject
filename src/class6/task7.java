package class6;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your country");
        String country=scanner2.next();

        switch(country){
            case "Ukraine":
                System.out.println("Ukrainian");
                break;
            case "Spain":
                System.out.println("Spanish");
                break;
            case "France":
                System.out.println("French");
                break;
            case "England":
                System.out.println("English");
                break;
            case "Brazil":
                System.out.println("Portuguese");
                break;
        }




    }
}