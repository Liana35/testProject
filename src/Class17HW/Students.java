package Class17HW;

public class Students {

   // Write a java Class Students that have a constructor which takes students name and 3 subject grades.
//    Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students
//    with different marks. Your program should print an average mark of each student.
//    NOTE: please use different names for instance and local variables.



    String name;
    double history;
    double algebra;
    double English;


    Students(String sName, double sHistory, double sAlgebra, double sEnglish){
        name=sName;
        history=sHistory;
        algebra=sAlgebra;
        English=sEnglish;


    }

    void avarageGrade() {
        double avarage = ((history + algebra + English) / 3);
        System.out.println(avarage);


    }
}
