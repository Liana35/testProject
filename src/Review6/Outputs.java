package Review6;

public interface Outputs {

void display(double result);
}

interface Functions extends Outputs{
   public void display(double result);


   double adding(double firstNumber , double SecondNumber);
   double subtracting(double firstNumber , double SecondNumber);
   double  multiply(double firstNumber , double SecondNumber);
   double dividing(double firstNumber , double SecondNumber);
}

class Main543 implements Functions{
   @Override
   public void display(double result) {
      System.out.println("The result is "+result);
   }

   @Override
   public double adding(double firstNumber, double SecondNumber) {
      return firstNumber+SecondNumber;
   }

   @Override
   public double subtracting(double firstNumber, double SecondNumber) {
      return firstNumber-SecondNumber;
   }

   @Override
   public double multiply(double firstNumber, double SecondNumber) {
      return firstNumber*SecondNumber;
   }

   @Override
   public double dividing(double firstNumber, double SecondNumber) {
      return firstNumber/SecondNumber;
   }

   public static void main(String[] args) {
      Main543 main = new  Main543();
      double firstNumber = 100.00;
      double secondNumber = 20.00;

      double result = main.adding(firstNumber, secondNumber);
      main.display(result);
       result = main.subtracting(firstNumber, secondNumber);
      main.display(result);
      result=main.multiply(firstNumber, secondNumber);
      main.display(result);
      result=main.dividing(firstNumber, secondNumber);
      main.display(result);

   }
}