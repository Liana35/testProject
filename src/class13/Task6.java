package class13;

public class Task6 {
    public static void main(String[] args) {
        String line1="Hello";
        String line2="Bye";

       line1=line1+line2;
        line2=line1.substring(0,line1.length()-line2.length());
        line1=line1.substring(line2.length());
        System.out.println(line1+" "+line2);



    }
}
