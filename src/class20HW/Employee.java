package class20HW;

public class Employee {
    /*
Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!
*/

    int hours;
    int yearsOfExp;
    String name;


    Employee(int hours, int yearsOfExp,String name){
        this.hours=hours;
        this.yearsOfExp=yearsOfExp;
        this.name=name;
    }

    void printInfo1(){
        System.out.println(name+" works "+hours +" a week and has "+yearsOfExp+" years of experience");
    }
}

class FullTime extends Employee{

    String nationality;
    int salary;

    FullTime(int hours, int yearsOfExp,String name, String nationality, int salary){
        super(hours, yearsOfExp,name);
        this.nationality=nationality;
        this.salary=salary;
    }

    void hardWorker(){
        System.out.println("Full time employee has salary of "+ salary +" and is "+nationality);
    }

}

class PartTime extends Employee{

    int days;

    PartTime(int hours, int yearsOfExp,String name, int days){
        super(hours,yearsOfExp,name);
        this.days=days;
    }

    void schedule(){
        System.out.println("Part time employee has a flexible schedule");
    }


}
