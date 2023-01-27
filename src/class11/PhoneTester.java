package class11;

public class PhoneTester {
    public static void main(String[] args) {

        // creating an object from the Cat class
        Phone iPhone=new Phone();

        //behaviours

        iPhone.photos();
        iPhone.calls();
        iPhone.text();


        // attributes  / properties/ fields
        iPhone.color="blue";
        iPhone.price=2000;
        iPhone.model="last";
        iPhone.version="updated";
        iPhone.isUnlocked=true;


        Phone Pixel=new Phone();
        Pixel.version="outdated";
        Pixel.model="Seventh";
        Pixel.price=100;

        Pixel.photos();
        Pixel.calls();
        Pixel.text();


        Phone Samsung= new Phone();
        Samsung.photos();
        Samsung.calls();
        Samsung.text();

        Samsung.model="Eleven";
        Samsung.color="White";
        Samsung.version="Upcoming";
        Samsung.price=1500;




        System.out.println(Pixel.version);
        System.out.println(iPhone.price);




    }
}