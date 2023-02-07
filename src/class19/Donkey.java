package class19;

public class Donkey {
    String name;
    int age;

    void print(){
        System.out.println("Donkey's name is "+name+ " age is"+ age);
    }
   /* Donkey(){
        System.out.println("This is a non-argument constructor");
    }*/
    Donkey(String name,int age){
        this.name=name; // right is local variable, left is instance
        this.age=age;
        // name=Dname;

    }


}
