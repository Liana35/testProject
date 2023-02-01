package class17;

public class Student {
    /* Write a java class that will have a constructor:
   one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.*/

    String ID;
    String name;
    int age;
    double weight;



    public Student(String studentName,String StudentID,int studentAge){
        ID=StudentID;
        age=studentAge;
        name=studentName;


    }



    public Student(String studentID, String studentName, int studentAge,double studentWeight){
        ID=studentID;
        name=studentName;
        age=studentAge;
        weight=studentWeight;


    }

    void printInfo2(){
        System.out.println("ID "+ID+" Name "+name+" age "+age+" weight "+ weight);
    }



}
