package class24;

public abstract class Phone {
    // create a phone class and create abstract methods displayPictures
    //unlockPhone
    //sendText/
    //create 2 child classes IPhone Samsung GooglePixel and provide specific implementations
    // write code to achieve runtime polymorphism


  abstract void displayPictures();
    abstract void unlockPhone();
    abstract void sendText();
}
 class IPhone extends Phone{
     @Override
     void displayPictures() {
         System.out.println("IPhone display high quality photos");
     }

     @Override
     void unlockPhone() {
         System.out.println("Iphone takes Face ID to unlock the phone");
     }

     @Override
     void sendText() {
         System.out.println("IPhone can send Imessages");
     }
 }
 class Samsung extends Phone{
     @Override
     void displayPictures() {
         System.out.println("Samsung can an easy access to a gallery");
     }

     @Override
     void unlockPhone() {
         System.out.println("Samsung has a fast unlock  features");
     }

     @Override
     void sendText() {
         System.out.println("Samsung sends messages");
     }
 }
