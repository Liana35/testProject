package class13;

public class Task2 {
    public static void main(String[] args) {
        String str = "12345GGGGG$%^&";

        /*int count=0;
        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i)));
            count++;
        }
        System.out.println(count);
*/

     // System.out.println(str.replaceAll("[A-Za-z0-9]","").length());


        // 2 ways

       // System.out.println(str.replaceAll("[^a-zA-Z0-9]","").length());
        System.out.println( str.replace("[A-Za-z0-9]","").length());
    }

}