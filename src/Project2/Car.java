package Project2;

public class Car {
    double carPrice;
    String carColor;
    Car(double carPrice,String carColor){
        this.carColor=carColor;
        this.carPrice=carPrice;
    }
   double calculateSalePrice(){
       return carPrice;
   }
}

class Truck extends Car{
    double weight;
    Truck(int carPrice,String carColor,double weight){
        super(carPrice,carColor);
        this.weight=weight;
    }

    @Override
   double calculateSalePrice() {
        if (weight>2000){
            return carPrice*0.10;
        }else {
            return carPrice*0.20;
        }
    }
}

class Sedan extends Car{

    double length;
    Sedan(double carPrice,String carColor,double length){
        super(carPrice,carColor);
        this.length=length;
    }

    @Override
    double calculateSalePrice() {
        if(length>20){
            return carPrice*0.5;
        } else {
            return carPrice*0.1;
        }
    }
}
