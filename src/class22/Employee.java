package class22;

public class Employee {
    String name;
   static int baseSalary=30000;
   static  int baseHolidays=10;
    void  printSalary(){
        System.out.println(baseSalary);
    }
    void  printSHolidays(){
        System.out.println(baseHolidays);
    }

}
class officeBoy extends Employee{

}
class Manager extends Employee{
    void  printSalary(){
        System.out.println((baseSalary*4)+20000);
    }
}

class Developer extends Employee{
    void  printSalary(){
        System.out.println((baseSalary*3)+300000);
    }
}

class QA extends Employee{
    void  printSalary(){
        System.out.println((baseSalary*5)+300000);
    }

    void  printSHolidays(){
        System.out.println(baseHolidays+5);
    }
}