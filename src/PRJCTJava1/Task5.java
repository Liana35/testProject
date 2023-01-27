package PRJCTJava1;

public class Task5 {
    public static void main(String[] args) {

        int [][] numbers={{1, 2, 4},
                {2,10,27},
                {30,50,5,1}
        };

        int evenNum=0;
        int oddNum=0;
        for(int i=0; i<numbers.length; i++){

            for(int j=0; j<numbers[i].length; j++){

                if(numbers[i][j]%2!=0){
                    evenNum+=numbers[i][j];
                }
                if(numbers[i][j]%2==0){
                    oddNum+=numbers[i][j];
                }

            }

        }
        System.out.println(evenNum);
        System.out.println(oddNum);


    }}
