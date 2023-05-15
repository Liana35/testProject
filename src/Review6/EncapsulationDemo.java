package Review6;

public class EncapsulationDemo {

    private String empName;
    private int empAge;
    public void setEmpName(String empName){
        System.out.println(empName);
    }
    public void setEmpAge(int empAge){
        System.out.println(empAge);
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public EncapsulationDemo(String empName,int empAge){
        this.empAge=empAge;
        this.empName=empName;
    }
}

class Main435{
    public static void main(String[] args) {
        EncapsulationDemo test= new  EncapsulationDemo("John", 30);
        System.out.println("Employee Name: "+test.getEmpName());
        System.out.println("Employee Age: "+test.getEmpAge());
    }
}


