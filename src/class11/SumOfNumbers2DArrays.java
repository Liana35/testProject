package class11;

public class SumOfNumbers2DArrays {
    public static void main(String[] args) {

        int [][] numbers= {{10, 20, 30},
                {15, 25, 35},
                {2, 4, 3}
        };

        int sum=0;
        for (int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length;j++){
                sum=sum+numbers[i][j];
            }
        }
        System.out.println("The total of all numbers is "+sum);


}}

