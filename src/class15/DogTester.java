package class15;

public class DogTester {
    public static void main(String[] args) {


        Dog dog=new Dog();
        dog.printFood();


        for(int i =0; i<2; i++){
            System.out.println(i);
        }
       // System.out.println(i); cant be used outside block of code,
        // it's a local variable
    }
}
