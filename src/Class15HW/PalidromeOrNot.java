package Class15HW;

import org.w3c.dom.ls.LSOutput;

public class PalidromeOrNot {
    public static void main(String[] args) {
        String str="dad";
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if(str.equals(reversedStr)){
            System.out.println("This String is Palidrome");
        }else{
            System.out.println("This String is not Palidrome");
        }
    }



    }





