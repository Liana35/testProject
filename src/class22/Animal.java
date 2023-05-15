package class22;

public class Animal {

    String name;
    String color;
    int age;
    double weight;
    void eat(){
        System.out.println("All animals eat");
    }
    void speak(){
        System.out.println("All animals can speak");
    }


}


class Cat extends Animal{
    void speak(){
        System.out.println("Meow Meow");
    }



}


class Dog extends Animal{
    void speak(){
        super.speak(); // will add all from parent class + whats below
        System.out.println("Dog can speak");
    }


}
class Tester{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.speak();
        Dog dog = new Dog();
        dog.speak();

    }
}