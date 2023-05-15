package class17;



public class Class17HW {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    Class17HW(String make,String model,int numberOfDoors,int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }


    Class17HW(String make,String model,int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=4;
        this.topSpeed=topSpeed;
        this.price=price;
    }

    Class17HW(int numberOfDoors,int topSpeed,double price){
        this.make="unknown";
        this.model="unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }

    Class17HW(String make,String model,int numberOfDoors){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=90;
        this.price=0;
    }

    void printInfo(){

        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }
       public static void main(String[] args) {
         Class17HW auto1=new Class17HW("Toyota", "Prius",4,120,30000.0);
          auto1.printInfo();
     Class17HW auto2=new Class17HW("Toyota", "Prius",120,30000.0);
       auto2.printInfo();
           Class17HW auto3=new Class17HW(4,120,30000.0);
           auto3.printInfo();
           Class17HW auto4=new Class17HW("Toyota", "Prius",4);
           auto4.printInfo();



       




    }}







