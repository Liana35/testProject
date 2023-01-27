package class13;

public class SplitMethod {
    public static void main(String[] args) {
        String str="I like Java.I write a lot of code daily. I am from batch 15.";
        String [] strArr=str.split("[.!?]");
       // System.out.println(strArr.length);
        System.out.println(strArr[2].trim());
        // whenever we are working with arrays we use length and when we are working with string we use length();
    }
}
