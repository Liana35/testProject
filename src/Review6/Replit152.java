package Review6;

public class Replit152 {

    String city;
    Replit152(String city){
        this.city=city;
    }
    void city(){
        System.out.println(city);
    }
    Replit152(){

    };

    void parentConstructor(){
        System.out.println("parent constructor");
    }

}
 class Child extends Replit152{


    Child(String city){
         super(city);

     }

 }

class ReplitTester extends Replit152{
    public static void main(String[] args) {
        Child ch= new Child("Vienna");
        ch.city();
        }
}



