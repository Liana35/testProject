package class21;

public class Task3 {


   private void method (String str1){

       System.out.println("Method with one String");
    }


  private void method (String str1,String str2){

       System.out.println("Method with two Strings");
    }
    private void method (String str1,String str2,String str3){

       System.out.println("Method with three Strings");
    }

    public static void main(String[] args) {
       Task3 task3= new Task3();
       task3.method("Java");// because its static method we dont need create an object
       task3.method("Python","java");
    }
}
