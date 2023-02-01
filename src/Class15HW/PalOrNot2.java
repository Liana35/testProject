package Class15HW;

public class PalOrNot2 {
    void isPalidrome(String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if(str.equals(reversedStr)){
            System.out.println("This String is Palidrome");
        }else{
            System.out.println("This String is not Palidrome");
        }
    }

    public static void main(String[] args) {
        PalOrNot2 task3=new PalOrNot2();
      //  String result=task3.isPalidrome("Kaya"); // cant assign void method to variables
        System.out.println();   // cant use void methods in PrintLn
        task3.isPalidrome("Hello");


    }


}
