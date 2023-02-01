package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {

        MethodPractice name = new MethodPractice();  // creating an object of class
        boolean isEven=name.isEven(15);
        System.out.println(isEven);



        boolean isEven2= name.isEven(100);
        System.out.println(isEven2);

        boolean isEven3=name.isEven(12);
        System.out.println(isEven3);

        boolean isEven4=name.isEven(20);
        System.out.println(isEven4);

        //shorter way, if we don't need to use isEVen4 anywhere else
        System.out.println(name.isEven(20));






    }
}
