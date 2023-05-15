package Project2;

public abstract class Marks {
   /* 2. We have to calculate the average of marks obtained in three subjects by student A and by
    student B. Create class 'Marks' with an abstract  method 'getPercentage' that will be returning
    the average percentage of marks. Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the
    marks in three subjects as its parameters and the marks in four subjects as its parameters for
    student B. Test your code
*/

    abstract double getPercentage();
}

class A extends Marks{

    private double one;
    private double two;
    private double three;
    A (double one,double two,double three){
        this.one=one;
        this.two=two;
        this.three=three;
    }

    @Override
    double getPercentage() {
        return (one+two+three)/3;
    }
}

class B extends Marks{
    private double one;
    private double two;
    private double three;
    private double four;
    B (double one,double two,double three,double four){
        this.one=one;
        this.two=two;
        this.three=three;
        this.four=four;
    }

    @Override
    double getPercentage() {
        System.out.println((one+two+three+four)/4);
        return (one+two+three+four)/4;
    }


}

