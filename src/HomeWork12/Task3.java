package HomeWork12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*System.out.println("Mom's first name: ");
        String mom= scan.next();
        System.out.println("Dad's first name");
        String dad= scan.next();
        System.out.println("Boy or Girl?");
        String boyOrGirl= scan.next();


        if(boyOrGirl.equalsIgnoreCase("Boy")){
            System.out.println("Suggested baby name is DANRY");
        } else if (boyOrGirl.equalsIgnoreCase("Girl")){
            System.out.println("Suggested baby name is Maiel");
        }
*/

        String dadsName="Daniel";
        String momsName="Mary";
        String expectation="Boy";

        if(expectation.equalsIgnoreCase("boy")){
            String firstHalf=dadsName.substring(0,dadsName.length()/2);
            String secondHalf=momsName.substring(momsName.length()/2);
            System.out.println(firstHalf+secondHalf);


        }
}}
