package class11;

public class Example {
    public static void main(String[] args) {


        int [][] matrix= {{10, 20, 30},
                {45,55,66},
                {30,40,20,10,25}
        };

        for (int i = 0; i < matrix.length; i++) {   //  matrix.length-  to show how many  1D arrays are there
            for (int j = 0; j < matrix[i].length; j++) { //  matrix[i].length -  the size of each 1D arrays
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

}}
