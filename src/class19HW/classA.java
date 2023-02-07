package class19HW;

public class classA {
   //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    int price;
    String hotelName;
    void internet(){
        System.out.println("Free Wi-Fi is available");
    }
}

 class classB extends classA{

    void breakfast(){
        System.out.println("Breakfast is included");
    }
    int parkingFee;

 }
 class classC extends classB{
    void pool(){
        System.out.println("Indoor pool");
    }

    int rooms;


 }