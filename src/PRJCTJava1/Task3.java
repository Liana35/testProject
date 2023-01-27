package PRJCTJava1;

public class Task3 {
    public static void main(String[] args) {
        int [][] numbers= {{10,20,30},
                           {1,2,3},
                           {5,5,5}
        };
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                sum=sum+numbers[i][j];
            }
        }
        System.out.println("The total of all elements is "+sum);




    }}
