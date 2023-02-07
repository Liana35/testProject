package class19HW;

import java.util.Enumeration;

public class TeacherTester {
    public static void main(String[] args) {

        Teacher teacher1= new Teacher();
       teacher1.name="Peter";
       teacher1.subject="History";
       teacher1.helpWHomeWork();
       teacher1.checkHomework();
        System.out.println(teacher1.name+" "+teacher1.subject);



        MathTeacher teacher2=new MathTeacher();
        teacher2.name="John";
        teacher2.subject="Math";
        teacher2.helpWHomeWork();
        teacher2.classMeeting();
        teacher2.math();
        System.out.println(teacher2.name+" "+teacher2.subject);


        ChemistryTeacher teacher3=new ChemistryTeacher();
        teacher3.name="Jaimy";
        teacher3.subject="Chemistry";
        teacher3.checkHomework();
        teacher3.projects();
        teacher3.chemistryLevel="High";
        teacher3.fun();
        System.out.println(teacher3.name);


        PianoTeacher teacher4=new PianoTeacher();
        teacher4.name="Lilia";
        teacher4.subject="Piano";
        teacher4.projects();
        teacher4.numbOfInstruments=4;
        teacher4.playsPiano();
        System.out.println(teacher4.numbOfInstruments);







    }


}
