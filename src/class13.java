import java.util.SortedMap;

public class class13 {

    String name;
    String lastName;
    int  employeeId;
    String startDate;
    int salary;




    class13(String name,String lastName,int  employeeId,String startDate,int salary){
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;
    }
    class13(){

    }
    void printInfo(){
        System.out.println(name+" "+ lastName+" "+employeeId+" "+startDate+" "+salary);
    }

    public static void main(String[] args) {
        class13 emp=new class13();
         emp.printInfo();
        class13 emp1=new class13("Joe", "Smith",12345,"01/01/1970",3500);
        emp1.printInfo();

    }
}