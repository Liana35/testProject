package class9;

public class ArraysDemo3 {
    public static void main(String[] args) {


        //10 20 30 40

        int [] number = {10,20,30,45,50};
        int total=0;

        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
            total=total+number[i];
        }
        System.out.println(total);


}}
