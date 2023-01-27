package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {

       int [] arr={10,13,20,25,45,50};
       // int[1]=0; - updating a single element in an array

       for (int i=0; i<arr.length; i++){
           if (arr[i]%2!=0){
               arr[i]=0;
               System.out.println(arr[i]);

           }
       }
        System.out.println("After replacing odd number with 0");
        for (int i=0; i<arr.length; i++){

                System.out.println(arr[i]);}



    }
}