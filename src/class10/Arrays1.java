package class10;

public class Arrays1 {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};
        System.out.println(arr[4]); // 4 is the index =5;
        System.out.println(arr[1]+" "+arr[4]);
        System.out.println("************");


        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);

        }
        System.out.println("******************************");
        for(int number: arr){
            System.out.println(number);
        }


    }
}
