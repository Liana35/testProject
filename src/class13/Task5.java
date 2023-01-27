package class13;

public class Task5 {
    public static void main(String[] args) {
        String str="aba";
        String rev="";


        for(int i=str.length()-1; i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);



        if(str.equals(rev)){
            System.out.println(str + " is Palindrome");
        }  else{
            System.out.println(str + " is not Palindrome");
        }



    }
}
