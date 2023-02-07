package Class17HW;



public class Task3H17Tester {

    int numbers (int num){

        while(num<10){
           // num++;
            System.out.println(num++);

        }return num;


        }
    public static void main (String[] args){

        Task3H17Tester line= new Task3H17Tester();
        int num2=1;
        System.out.println(line.numbers(num2));



    }
}