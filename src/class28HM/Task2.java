package class28HM;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        //Create an arraylist of cars and retrieve all the values using 3 different ways.

        ArrayList<String> cars= new ArrayList<>();
        cars.add("Honda");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Kia");
        cars.add("Tesla");
        System.out.println(cars);


        for(int i=0; i<cars.size(); i++){
            System.out.print(cars.get(i)+" ");
        }

        for(String c:cars){
            System.out.println(c);
        }

        int i=0;
        while(i<cars.size()){
            System.out.println(cars.get(i)+" ");
            i++;
        }
    }
}
