package class19HW;

public class testClassABC {
    public static void main(String[] args) {

    classA hotel1= new classA();
    hotel1.price=100;
    hotel1.hotelName="Hilton";
    hotel1.internet();

        System.out.println(hotel1.price);
        System.out.println(hotel1.hotelName);


        classB hotel2= new classB();
        //features from parent
        hotel2.price=150;
        hotel2.hotelName="Marriot";
        hotel2.internet();
        // features from its own method
        hotel2.breakfast();
        hotel2.price=50;
        System.out.println(hotel2.price);


        classC hotel3=new classC();
        //parent method
        hotel3.price=200;
        hotel3.hotelName="Ritz";
        hotel3.internet();
        //from class B
        hotel3.breakfast();
        hotel3.parkingFee=20;
        //from its own method
        hotel3.pool();
        hotel3.rooms=250;











}}
