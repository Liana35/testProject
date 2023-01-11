package class6;

public class class6task4 {
    public static void main(String[] args) {

        boolean workDay=true;
        int day=1;

        while(workDay){
            if(day<6){
            System.out.println("I need a day off");
                day++;
            } else if (day==6){
                workDay=false;
                System.out.println("I don't need a day off anymore");
            }

        }
        }

    }
