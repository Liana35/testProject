package Review6;

public class MoreStringMethods {
    public static void main(String[] args) {

        String myString="Today is February 2";

        String [] strArray=  myString.split(" ");   // split based on spaces

        for(String s:strArray){
            System.out.println(s);
        }


        System.out.println("---------------------------------");
        System.out.println(myString);
        String newStr=myString.substring(9);
        System.out.println(newStr);


        int index=newStr.indexOf('b');
        System.out.println(index);


        String anotherStr="Today is Thursday";
       index= anotherStr.indexOf("Thursday");
        System.out.println("index of Thursday is "+index);




    }
}
