package Class15HW;

public class Student {


    char getGrade(int score ){


        if(score>90){
            return 'A';
        }else if(score>80){
            return 'B';
        } else if(score>70){
            return 'C';
        }else if(score>50){
            return  'D';
        } else{
            return 'F';
        }




    }

    public static void main(String[] args) {
        Student scoreLetter= new Student();
        int gradeOfStudent=97;
        System.out.println(scoreLetter.getGrade(gradeOfStudent));

    }
}
