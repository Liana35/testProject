package class23;

public class StudentTester {
    public static void main(String[] args) {

        Student [] students= {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student st:students){
            st.comesOnTime();
            st.studiesFullTine();
            st.studiesHard();
        }


        Student [] students2={new SchoolStudent(), new CollegeStudent()};
        for(Student st2:students2){
            st2.studiesHard();
            st2.comesOnTime();
            st2.studiesFullTine();
        }

    }
}
