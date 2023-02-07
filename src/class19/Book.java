package class19;

public class Book {

    int year;
    int price;
    String name;



    Book(int year,  String name){
        this.year=year;
        this.name=name;

    }
    Book(int year,  String name, int price){
        this(year, name);
       this.price=price;
    }
    void info(){
        System.out.println(year+" "+ price+" "+name);
    }


    public static void main(String[] args) {
        Book book1=new Book(2001, "Alice in wonderland 2", 20);
        book1.info();

    }
}
