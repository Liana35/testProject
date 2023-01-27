package class9;

import java.util.*;
class Main {
    public static void main(String[] args) {

        String [] days= new String[7];
        System.out.println("Enter days of the week");
        Scanner scan=new Scanner(System.in);
        days[0]= scan.next();
        days[1]= scan.next();
        days[2]= scan.next();
        days[3]= scan.next();
        days[4]= scan.next();
        days[5]= scan.next();
        days[6]= scan.next();

        for(int i=0; i<days.length; i++){
            System.out.println(days[i]);
        }






    }}