package Class16HW;

 public class Task1Array {


     //Create a method that will accept an array as parameters and will return a sum of all elements from that array.
     // Method should be visibly only within same package and accessible by the creating an instance of the class.

     int sumoOfArray(int []arr){
         int sum=0;
         for(int total:arr){
             sum+=total;
         }
         return sum;

     }


     public static void main(String[] args) {

         Task1Array num= new Task1Array();

         int []box={10,20,30};
         System.out.println(num.sumoOfArray(box));
         //or
         System.out.println(num.sumoOfArray(new int []{10,15,15}));


     }




}
