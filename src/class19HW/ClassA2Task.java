package class19HW;

public class ClassA2Task {
    //   Write program to inherit class A that has method printF which is static and call or reuse that method into class B


    static void printF() {
        System.out.println("Calling method printF from class A");

    }
}

class B extends ClassA2Task {
    void printInfo() {
        System.out.println("Additional line");

    }


    public static void main(String[] args) {

        B line = new B();
       // line.printInfo();
        line.printF();


    }
}