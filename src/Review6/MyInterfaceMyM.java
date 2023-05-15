package Review6;

public interface MyInterfaceMyM {
   void parentMethod();

}
interface ChildInterface extends MyInterfaceMyM  {
    void childMethod();
}

class Main5555 implements ChildInterface{
    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    @Override
    public void childMethod() {
        System.out.println("Child Method-hello Syntax");
    }

    public static void main(String[] args) {
        Main5555 test= new Main5555();
        test.parentMethod();
        test.childMethod();
    }
}