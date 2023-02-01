package class16;

public class SyntaxEmployee {

    String empID;
    int salary;
   static String CEO="Sumair";


    public static void main(String[] args) {

        SyntaxEmployee emp1= new SyntaxEmployee();
       emp1.empID="S333";
       emp1.salary=7500;



        SyntaxEmployee emp2= new SyntaxEmployee();
        emp2.empID="555";
        emp2.salary=5500;
        System.out.println(emp2.empID);
        System.out.println(emp2.salary);
        System.out.println(emp2.CEO);
        System.out.println(emp1.CEO);


        ;






    }



}
