package class19;

public class ConstructorChaining {

    ConstructorChaining(){  // signature
        System.out.println("I am non argument constructor"); // we can only have one non arg constructor
    }

    //parametrized constructor below
    ConstructorChaining(String str){ // signature
        this();    //a call should be the first line always
        System.out.println(str);
    }

    ConstructorChaining(String str,int number){  // signature
        this(str);
        System.out.println("This is constructor with int parameter");
    }


    public static void main(String[] args) {
        ConstructorChaining obj= new ConstructorChaining("hello",20);
        System.out.println("---- End of the code------");
    }


}
