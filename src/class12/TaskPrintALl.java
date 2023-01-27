package class12;

public class TaskPrintALl {
    public static void main(String[] args) {

        // to print all the letters from String one by one
        String str="Java is great";
        for (int i=0; i<str.length(); i++)
            System.out.println(str.charAt(i));


        // how many times letter " a" has appeared

        int count=0;
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Letter a has appeared "+ count+ " times");
    }
}
