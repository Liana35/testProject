package Project2;

public class CarTester {
    public static void main(String[] args) {
        Car [] carArr={  new Truck(40000,"White",200.00), new Sedan(50000,"Blue",19) };
        for(Car cars:carArr){

            System.out.println(cars.calculateSalePrice());
        }
    }
}
