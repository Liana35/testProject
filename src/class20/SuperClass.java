package class20;

public class SuperClass {

    SuperClass(){

        System.out.println("I am a constructor from the parent class"); // constructor
    }
}

class SubClass extends SuperClass{
    SubClass(){
        super(); // should be the first word in constr. , makes a call to parent class
        System.out.println("I am a child constructor");
    }


}