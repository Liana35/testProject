package class19;

public class Furniture {
    String type;
    double price;
    String color;

    //creating a constructor
    Furniture(String type, double price, String color){

        this.type=type; // sType-local variable
        this.price=price;
        this.color=color;
    }



    /*void Furniture(){  -- adding void makes it a method, not a constructor

    }
*/

    // method
    void print (){
        System.out.println(type+" price is "+price+" and color is "+color);
    }



}
