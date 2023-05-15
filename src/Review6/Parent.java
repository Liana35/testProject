package Review6;

public class Parent {
    int number;
    Parent(){
        System.out.println("Parent Constructor without argument");
    }
    Parent(int number){
        this.number=number;
        System.out.println(number);
    }


}
class Child2 extends Parent{

    Child2(){
        System.out.println("Child Constructor without argument");
    }
    Child2(int number){
        super(number);

    }

}
class Main{
    public static void main(String[] args) {
        Child2 ch=new Child2();
        Child2 ch2=new Child2(10);

    }
}

