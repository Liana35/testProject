package class23;

public class Student {
    public void studiesFullTine(){
        System.out.println("This student studies 40 hours");
    }
    public void comesOnTime(){
        System.out.println("This student comes to class on time");
    }
    public void studiesHard(){
        System.out.println("This student studies hard");
    }
}

class SyntaxStudent extends Student{
    @Override
    public void studiesFullTine() {
        System.out.println("Syntax Student studies 20 hours");
    }

    @Override
    public void comesOnTime() {
        System.out.println("Syntax Student comes to class early");
    }

    @Override
    public void studiesHard() {
        System.out.println("Syntax Student studies  very hard");
    }
}


class CollegeStudent extends Student{
    @Override
    public void studiesFullTine() {
        System.out.println("College Student studies 35 hours");
    }
}


class SchoolStudent extends Student{
    @Override
    public void studiesFullTine() {
        System.out.println("School Student studies 50 hours");
    }

    @Override
    public void comesOnTime() {
        System.out.println("School Student comes to class on time");
    }

    @Override
    public void studiesHard() {
        System.out.println("School Student studies hard");
    }
}