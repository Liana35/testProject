package Class17HW;

public class Task3H17 {

    //    Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
//    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
//    3 - from different class inside different package  and observe result.


    private Task3H17(int one){
        System.out.println("Private access level "+one);
    }
    Task3H17(int a ,String s){
        System.out.println("Default access level"+a+ " " +s);
    }
    protected Task3H17(String s){
        System.out.println("Protected access level"+s);
    }
    public Task3H17(){
        System.out.println(" This is public constructor");

    }

    public static void main(String[] args) {
        Task3H17 sameClass= new Task3H17(2, "hjerhj");

    }
}

