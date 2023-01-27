package class11;

import java.util.Arrays;

public class D2ArraysTaskCars {
    public static void main(String[] args) {

        // 2 ways of retrieving all values
        String[] [] cars={{"American", "German", "Korean", "Italian"},
                {"Ford","Audi", "Kia", "Ferrari" }
        };

        // enhanced loop

        for(String[]arr: cars){
            for(String line:arr){
                System.out.println(line+" ");
            }
            System.out.println();
        }

        System.out.println("****************");



        for(String []brands:cars){
            System.out.println(Arrays.toString(brands));
        }


        System.out.println("******************");

        for (int i=0; i<cars.length; i++){
            for (int j=0; j<cars[i].length; j++){
                System.out.println(cars[i][j]+" ");
            }
            System.out.println();
        }



    }}
