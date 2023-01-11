package class4;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerCityTemp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your city");
        String city=scan.next();
        System.out.println("What is the temperature in Fahrenheit?");
        double temp=scan.nextDouble();
        System.out.println("The temperature in the city is "+ (temp-32)*5/9+ " in Celsius");


    }
}
