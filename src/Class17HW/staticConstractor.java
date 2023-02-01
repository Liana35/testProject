package Class17HW;

public class staticConstractor {
    /*Write program that have static constructor and observe result.*/
//does not allow to declare static to constructor.


    int age;
    String name;

  // static constructor is not allowed
  staticConstractor(int sAge, String sName){
        age=sAge;
        name=sName;
    }
    void printInfo(){
        System.out.println(age+" "+ name);
    }

    public static void main(String[] args) {
        staticConstractor test=new staticConstractor(12,"Reema");
        test.printInfo();
    }



}
