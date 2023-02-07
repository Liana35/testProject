package class19;

public class Student {

    String name;
    String address;


    Student(String name,String address){
        this.name=name;
        this.address=address;

    }

    void  displayInfo(){
        System.out.println(name+" "+address);
    }


    public static void main(String[] args) {
        Student st1=new Student("Nataly","2205 Stuart Dr");
        st1.displayInfo();


    }
}
