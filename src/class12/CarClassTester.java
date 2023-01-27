package class12;

public class CarClassTester {
    public static void main(String[] args) {


        // this is a method - carClass tester
        // the carClass -is a class

        //Create an object of a class
        CarClass bmw= new CarClass();  // bmw is an object
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;

        bmw.moveForward();   // calling a method
        bmw.applyBreaks();


        CarClass audi=new CarClass();
        audi.make="Audi";
        audi.model="E-tron";
        audi.year=2020;
        audi.moveForward();
        audi.applyBreaks();







    }
}
