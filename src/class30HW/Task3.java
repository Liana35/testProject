package class30HW;

import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format John Smith=$100000
     */
        TreeMap<String, Integer> employee = new TreeMap<>();
        employee.put("John", 5000);
        employee.put("Anya", 6000);
        employee.put("Kimberly", 2500);
        employee.put("Inna", 7500);

        var entrySet5=employee.entrySet();
        int maxSalary=0;
        String maxSalaryEmp="";
        for(var entry:entrySet5){
            if(entry.getValue()>maxSalary){
                maxSalary=entry.getValue();
                //maxSalaryEmp=entry.getKey();
            }
        }
        System.out.println(maxSalaryEmp+"=$"+maxSalary);
    }
}
