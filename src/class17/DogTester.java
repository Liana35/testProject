package class17;

public class DogTester {
    public static void main(String[] args) {
        // constructor calls
        Dog dog1= new Dog("Oscar","Pitbull",2, 7.5);
        dog1.printInfo();
        Dog dog2= new Dog("Ruby","Doberman",3,8.5);
        dog2.printInfo();
        Dog dog3= new Dog("Artur","Labrador",4,9.5);
        dog3.printInfo();
        Dog dog4= new Dog("Tuzik","Pug",5,5.5);
        dog4.printInfo();
        Dog dog5= new Dog("Belka","Husky",7,7.5);
        dog5.printInfo();
        // assigning values to instance fields
       /* dog5.name="Belka";
        dog5.breed="Husky";
        dog5.age=7;
        dog5.weight=7.5;
*/


    }
}
