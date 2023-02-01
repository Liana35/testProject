package Class15HW;

public class Task5 {



    boolean primeNumber(int num){
        boolean box=true;

        if(num<1){
            box=false;
        }else if(num>1){
            for(int i=2;i<num;i++){
                if (num%i==0){
                    box=false;
                }
            }
        }
        return box;
    }

    public static void main(String[] args) {
        Task5 numbers=new Task5();
        int primeN= 3;
       System.out.println(numbers.primeNumber(primeN));


    }
}
