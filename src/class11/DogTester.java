package class11;
import java.util.Scanner;
// scanner is if the class is not present in the same package

public class DogTester {

    public static void main(String[] args){

        // creating an actual object from the class Scanner
       // Scanner scanner= new Scanner(System.in);
        // this is how we create the objects of the class
        Dog jacky=new Dog();
        jacky.bark();
        jacky.sleep();

    }

}
