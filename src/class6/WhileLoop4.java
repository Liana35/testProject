package class6;

public class WhileLoop4 {
    public static void main(String[] args){

        int number=1;
        int sum=0;
        while(number<=10){
            sum=sum+number;
            number++;
        }
        System.out.println(sum);





        boolean condition=true;
        int number5=0;
        while (condition){
            System.out.println("Hello world");
            if(number5>3){
                condition=false;
            }
            number5++;

        }



    }
}
