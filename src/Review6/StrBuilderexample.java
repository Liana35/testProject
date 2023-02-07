package Review6;

public class StrBuilderexample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb);
        String str=sb.toString(); // converting to string, no changes are allowed
        str.toUpperCase();
        System.out.println(str);
    }
}
