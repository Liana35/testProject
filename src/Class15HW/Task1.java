package Class15HW;

public class Task1 {

    //larger number
    int number(int num1, int num2){

        if(num1>num2){
            return num1;
        } else {
            return num2;
        }

    }

    public static void main(String[] args) {
        Task1 larger= new Task1();
        System.out.println(larger.number(200,40));

    }

}
