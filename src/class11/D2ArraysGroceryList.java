package class11;

import java.util.Arrays;

public class D2ArraysGroceryList {
    public static void main(String[] args) {

        String[][]grocery={{"Cucumbers", "Tomatoes", "Broccoli"},
                {"Apple", "Orange","Pears"},
                {"Yoghurt","Cheese"},
                {"Cookies", "Ice cream", "Candy"}
        };


        //1st way
        for(int i=0; i<grocery.length; i++){
            for(int j=0; j<grocery[i].length; j++ ){
                System.out.println(grocery[i][j]+" ");
            }
            System.out.println();
        }

        // 2d way
        for(String[] list: grocery){
            System.out.println(Arrays.toString(list));
        }

    }}
