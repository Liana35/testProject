package class17;

public class Pasta {
   /* Write a java class that will have a constructor:
    one with parameters and second without
    any parameters. Create a separate Test class
    where you will execute both of the
                    constructors 1 by 1.
            */

    String type;
    String sauce;
     int cost;
   Pasta(String pType,String pSauce, int pCost){
         type=pType;
         sauce=pSauce;
         cost=pCost;


     }

   Pasta(){
         type="Ravioli";
         sauce="Cream sauce";
         cost=30;

     }
     void printInfo(){

         System.out.println(type+" "+sauce+" "+cost);
     }









}
