package class22;

public class CreditCard {
    /*create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/

    int balance;
    int interest;

    void interestCalc( int balance){
        interest=balance/5;
        System.out.println("The interest is "+interest);
    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    void interestCalc( int balance){
        interest=balance/3;
        System.out.println("The interest is "+interest);

    }
}

class CreditCardTester{
    public static void main(String[] args) {
        CreditCard credit=new CreditCard();
        credit.interestCalc(200);
        Visa credit2=new Visa();
        credit2.interestCalc(300);
        AX credit3=new AX();
        credit3.interestCalc(50 );


    }
}
