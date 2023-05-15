package Review6;

public class EncapsulationDemo2 {

   private String empName="John";
    private int empAge=30;

    String getEmpName(){
        return "John";
    }

    int getEmpAge(){
        return 30;
    }

}

class Main5478{
    public static void main(String[] args) {
        EncapsulationDemo2 person  = new EncapsulationDemo2();
        System.out.println("Employee Name: "+person.getEmpName());
        System.out.println("Employee Age: "+person.getEmpAge());
    }
}

