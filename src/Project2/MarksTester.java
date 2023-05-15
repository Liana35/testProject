package Project2;

public class MarksTester {
    public static void main(String[] args) {
        Marks [] grades= {new A(10,8,8),new B(5,5,8,10)};
        for(Marks m:grades){
            m.getPercentage();
            System.out.println(m.getPercentage());
        }

    }
}
