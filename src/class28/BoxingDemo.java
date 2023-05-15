package class28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {
        Integer integer=new Integer(10);
        int number=integer; // its auto unboxing
        int number2=integer.intValue(); // unboxing

        double d=12.3;
        Double wrapperD=new Double(d); // boxing
        Double wrapperP=d; // autoBoxing

        Float f=12f;
        ArrayList<Float> arrayList=new ArrayList<>();
        arrayList.add(12.0f);

        double fg=12f;


        /*Visually simplified.

        Boxing:
        It is the process of converting primitive data types to its corresponding wrapper type or object type.
                Integer i = new Integer (10)    => Boxing
        int one = I;                                   => Unboxing

        AutoBoxing:
        It says that we just have to assign a wrapper type to a primitive type of variable and conversion will happen automatically.
        Character gf = ‘a’;     => Autoboxing
        char ch = gf;               => Auto-unboxing
*/


    }
}
