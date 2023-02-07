package class19HW;

import java.util.logging.SocketHandler;

public class Teacher {

    //Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own
    // features and behaviour. Test all 4 classes



    String name;
    String subject;

    void helpWHomeWork(){
        System.out.println("This teacher helps with homework");
    }

    void checkHomework(){
        System.out.println("This teacher checks homework");
    }

    void classMeeting(){
        System.out.println("This teacher leads class meeting");
    }
    void projects(){
        System.out.println("This teacher assigns projects");
    }
}

class MathTeacher extends Teacher{
    void math(){
        System.out.println("Teaches math");
    }

}

class ChemistryTeacher extends Teacher{
    String chemistryLevel;
    void fun(){
        System.out.println("Shows fun experiments");
    }

}

class PianoTeacher extends Teacher{
    int numbOfInstruments;
    void playsPiano(){
        System.out.println("Plays piano well");
    }
}