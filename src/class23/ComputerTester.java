package class23;

public class ComputerTester {
    public static void main(String[] args) {

        Computer[] computers={new Apple(), new Lenovo(), new HP(), new Dell()};
        for (Computer computer:computers) {
            computer.memory();
            computer.Windows();


            // type casting to use all available to class methods, but will give an error to the rest lenovo dell
            Apple apple=(Apple)computer;
            apple.bluetooth();


            // the right way
            if(computer instanceof Apple){
                Apple apple1=(Apple)computer;
            }


    }

    }}