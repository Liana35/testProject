package class11;

public class D2ArraysEvenNumbers {
    public static void main(String[] args) {
        int [][] evenNumbers={{10,15,12,14},
                              {5,4,6,8},
                              {22,11,33,44}
        };


        for(int i=0; i<evenNumbers.length; i++){
            for(int j=0; j<evenNumbers[i].length; j++){
                if(evenNumbers[i][j]%2==0){
                    System.out.print(evenNumbers[i][j]+" ");

                }

            }
            System.out.println();
        }





    }}
