package class28HM;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {
  /*  Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as
   getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel
   and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList. Using
   for loop/advanced for loop/ iterator access all methods of the class.
   */

    String  insuranceName;
   abstract void getQuote();
    abstract void cancelInsurance();
    Insurance(String  insuranceName ){
        this.insuranceName=insuranceName;
    }
}

class Car extends Insurance{

    String carModel;
    @Override
    void getQuote() {
        System.out.println("Car quote is 500 for "+ carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println("you can cancel your insurance at any time for "+carModel);
    }
    Car(String  insuranceName,String carModel){
        super(insuranceName);
        this.carModel=carModel;
    }


}

class Pet extends Insurance{
    String petType;
    @Override
    void getQuote() {
        System.out.println("Pet quote is 100 for "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println("cancel a pet insurance for "+petType);
    }
    Pet(String  insuranceName, String petType){
        super( insuranceName);
        this.petType=petType;
    }


}


class Health extends Insurance{
    @Override
    void getQuote() {
        System.out.println("getQuote from Health Class");
    }

    @Override
    void cancelInsurance() {
        System.out.println("cancelInsurance from Health Class");
    }
    Health(String  insuranceName ){
        super(insuranceName );
    }

    public static void main(String[] args) {
        ArrayList<Insurance> ins=new ArrayList<>();
        ins.add(new Car("Geico","Honda"));
        ins.add(new Pet("AnimalProtection", "Dog"));
       ins.add(new Health("Aetna"));

       //1
      for(Insurance ins2:ins){
          ins2.getQuote();
          ins2.cancelInsurance();
      }


      //2
        for (int i = 0; i < ins.size(); i++){
            ins.get(i).cancelInsurance();
            ins.get(i).getQuote();
        }

        //3
        Iterator<Insurance> itt=ins.iterator();
        while(itt.hasNext()){
            Insurance i= itt.next();
            i.getQuote();
            i.cancelInsurance();
        }





    }
}
