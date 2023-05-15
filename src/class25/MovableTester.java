package class25;

public class MovableTester {
    public static void main(String[] args) {
        washAble [] washAble={new SmartWatch(), new Inverter(),new Phone()};
        for( washAble w:washAble) {
            w.wash();
        }


    }
}
