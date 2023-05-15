package class15;

public class Mpractice4 {

    // create a method that takes 2 numbers as parameters and return the larger number


    int largerNumber(int num1, int num2){


        if(num1>num2){
            return num1;
        } else {
         return num2;
        }

    }

    public static void main(String [] args){

        Mpractice4 mp=new Mpractice4();

        System.out.println(mp.largerNumber(12,15));



    }

}
