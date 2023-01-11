package class4;

public class HomeworkTask1 {
    public static void main(String[] args) {
        boolean diploma=true;
        boolean dProgram=true;
        double gpa=3.5;

        if(diploma){
            System.out.println("Congratulations");
            if (dProgram) {
                if (gpa>=3.5){
                    System.out.println("You are eligible for scholarship");
                }else
                    System.out.println("You should have studied harder");

            }
        }

        }
    }

