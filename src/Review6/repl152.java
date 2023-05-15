package Review6;

public class repl152 {

public class Parent {
    String city;
    Parent(String city){
        this.city=city;}
    void city(){
        System.out.println(city);
    }
    Parent(){}

    void parentConstructor(){
        System.out.println("parent constructor");
    }}
class Child extends Parent{
    Child(String city){

        super(city);
    }
}

}

