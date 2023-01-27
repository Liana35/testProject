package class11;

import java.util.Arrays;

public class D2ArraysCountries {
    public static void main(String[] args) {

        String [][] countries={{"USA","Canada"},
                              {"Peru", "Brazil","Chile", "Argentina"},
                              {"France", "Ukraine", "Portugal", "Austria"},
                              {"Thailand","South Korea","China"},
                              {"Tunis", "Morocco", "Zimbabwe"}
        };

        int total=0;
        for (int i=0; i<countries.length; i++){
            for (int j=0; j<countries[i].length; j++){
                total++;
            }

        } System.out.println("You have created "+total+" countries");


        for(String[] totalCountries: countries){
            System.out.println(Arrays.toString(totalCountries));
        }
        



}}
