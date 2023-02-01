package class16;

import java.util.Scanner;

public class Students {

    String name;
    String ID;
   static int numberOfStudents;


    public static void main(String[] args) {

        Students nezir=new Students();
        nezir.name="Nezir";
        nezir.ID="12DD";
        nezir.numberOfStudents++;


        Students ardasher=new Students();
        ardasher.name="ardasher";
        ardasher.ID="14DD";
        ardasher.numberOfStudents++;
        System.out.println(Students.numberOfStudents);

        Students student3=new Students();
        student3.name="Oleg";
        student3.ID="12DD";
        student3.numberOfStudents++;


        System.out.println(student3.name);
        System.out.println(student3.ID);
        System.out.println(student3.numberOfStudents);



    }



}
