package class17;

public class Dog {

    //instance fields
    String name;
    String breed;
    int age;
    double weight;


    // creating a constructor
    Dog(String dogName,String dogBreed,int dogAge, double dogWeight){
        name= dogName;
        breed=dogBreed;
        age=dogAge;
        weight=dogWeight;
    }

    void printInfo(){
        System.out.println("Name "+name+" Breed "+ breed+" age "+age+" Weight "+weight);
    }

}
