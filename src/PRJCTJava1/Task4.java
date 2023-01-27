package PRJCTJava1;

public class Task4 {
    public static void main(String[] args) {

        int [][] numbers={{10, 20, 33},
                {2,12,37},
                {3,55,44,20}
        };

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                if(numbers[i][j]%2==0){
                    System.out.println(numbers[i][j]);
                }
            }
        }

    }}
