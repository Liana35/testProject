package class11;

public class Homework2DArrays1 {

    public static void main(String[] args) {

        String [][] students = {{"Sonia", "Alec", "Stephanie", "Jude"},
                               { "A", "B", "C", "D"}};


        for(int i=0; i<students.length; i++){
            for(int j=0; j<students[i].length; j++)
                if (students[i][j].equals("A")|| students[i][j].equals("B")){
                    System.out.println(students[0][j]+" ");
                }

        }





    }}
