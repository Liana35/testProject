package class15;

public class Task2 {




    boolean oddOrEven(int num){

        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {


    Task2 number= new Task2();
    boolean box=number.oddOrEven(20);
        System.out.println(box);



}}
