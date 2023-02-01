package class15;

public class Dog {


    String name;     // instance variables
    // access within method - in a class
    String breed;

    static int noOfLegs=4;  // static variable
                            // share info between objects, class, method
    void printFood(){
        String food="meat";         // local variable
        System.out.println(food);
    }



}
