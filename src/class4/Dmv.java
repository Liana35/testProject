package class4;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        for(int i =num-1; i>=0; i--){
            System.out.print(i+" ");
        }



    }
}