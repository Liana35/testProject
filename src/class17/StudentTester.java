package class17;

public class StudentTester {
    public static void main(String[] args) {

        Student student1= new Student("123", "Maria",22,60);
        /*student1.ID="123";
        student1.name="Maria";
        student1.age=22;
        student1.weight=60;*/
        student1.printInfo2();

        Student student2= new Student("345","Vina",20,70);
        Student student3= new Student("555","Sveta",30,55);
        Student student4= new Student("445","Kate",33,57);
        Student student5= new Student("55","Olivia",40,72);
        student5.ID="55";
        student5.name="Olivia";
        student5.age=40;
        student5.weight=72;

        Student studentG= new Student("Bella", "223",29);

        student2.printInfo2();


    }
}
