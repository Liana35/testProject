package class6;

public class LogicalOrDemo {
    public static void main (String [] args){

        String day="Monday";

        if(day.equalsIgnoreCase("Monday")||day.equals("Friday")){
            System.out.println("No class today");
        }else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
            System.out.println("Java class enjoy");
        }else{
            System.out.println("Wrong day");
        }


    }

}
