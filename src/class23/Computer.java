package class23;

public class Computer {

   /* Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override
    some of the methods in child classes. Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.*/
    public void memory(){
        System.out.println("This computer has 5 GB of memory" );
    }
    public void Windows(){
        System.out.println("This computer works with Windows");
    }

    int price;
    String model;
}
class Apple extends Computer{

    @Override
    public void memory() {
        System.out.println("Apple has 15 GB of memory" );
    }
    public void bluetooth() {

        System.out.println("Apple has bluetooth access" );
    }
}
class Lenovo extends Computer{
    @Override
    public void Windows() {
        System.out.println("Lenovo works with Windows");
    }
    public void WiFi(){
        System.out.println("Lenovo has automatic connection to WiFi");
    }
}
class HP extends Computer{
    @Override
    public void Windows() {
        System.out.println("HP works with Windows");
    }
     public void worth(){
         System.out.println("HP is worth the price");
     }
}

class Dell extends Computer{
    @Override
    public void Windows() {
        System.out.println("Dell works  well with Windows");
    }
    public void fast(){
        System.out.println("Dell is fast");
    }
}