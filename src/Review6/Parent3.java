package Review6;

public class Parent3 {
    String city;

    Parent3(String city){
        this.city=city;
    }
    public void display(){
        System.out.println("City name "+city);
    }

}

 class Child1 extends Parent3{
    Child1(String city){
        super(city);
    }
}
class Main4 {
    public static void main(String[] args) {
        Child1 ch=new Child1("Fairfax");
        ch.display();
    }
}
