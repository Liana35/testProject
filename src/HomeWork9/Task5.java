package HomeWork9;

public class Task5 {
    public static void main(String[] args) {

        int [] numbers= new int [5];
        numbers [0]=10;
        numbers [1]=20;
        numbers [2]=30;
        numbers [3]=5;
        numbers [4]=5;
        int sum=0;

        for(int i=0; i<numbers.length; i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);

    }
}