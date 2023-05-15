package class26;

public interface TrustAble {
    public static final  int age=10; // Constants , in other way they are always public static final by default in interface
    String color="djfsdh";

   int trust();  // its already  public abstract  by default

    static void method1(){
        System.out.println("Hello world");
    }


    default void method2(){

    }
    }

    class BankOfAmerica implements TrustAble{

        @Override
        public int trust() {
            return 0;
        }

        public static void main(String[] args) {
            TrustAble.method1();
            System.out.println(TrustAble.age);
        }
    }

