package class11;

public class DogClassTester {
    public static void main(String[] args){

        // creating an actual object

        DogClass Husky=new DogClass();
         Husky.play();
         Husky.bark();
         Husky.eat();

         Husky.age=3;
         Husky.name="Archi";
         Husky.colour="Grey";
         Husky.breed="Husky";


         DogClass Bulldog=new DogClass();
         Bulldog.bark();
         Bulldog.play();
         Bulldog.protect();

         Bulldog.name="Robin";
         Bulldog.breed="Bulldog";
         Bulldog.colour="White";
         Bulldog.age=5;


         DogClass Labrador=new DogClass();

         Labrador.colour="Golden";
         Labrador.breed="Labrador";
         Labrador.name="Tuzik";
         Labrador.age=7;

         Labrador.bark();
         Labrador.play();
         Labrador.protect();
         Labrador.eat();


        System.out.println(Labrador.name);
        System.out.println(Bulldog.colour);
        System.out.println( Husky.name);





    }}
