package Class17HW;

public class Student {
    //    Write a Student class that have instance variables name and address.
//    Create a constructor that will initialize those variables.
//    Print name & address of given  student using displayInfo method.



    String name;
    String address;

    Student(String sName,String sAddress){
        name=sName;
        address=sAddress;
    }
    void printInfo(){
        System.out.println("The name is "+ name+" and the address is "+ address);
    }

    public static void main(String[] args) {
        Student st=new Student("Sveta","2235 Newford Street");
        st.printInfo();
    }


}
