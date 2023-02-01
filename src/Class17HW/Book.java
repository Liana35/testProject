package Class17HW;

public class Book {
    String name;
    int year;
    String author;


    Book (String sName, int sYear, String sAuthor){
        name=sName;
        year=sYear;
        author=sAuthor;
    }

    Book(int iYear, String bName){
        year=iYear;
        name=bName;
        System.out.println();
    }

    void printInfo(){
        System.out.println(name+" name "+ year+" year "+ author+ " author");
    }

    public static void main(String[] args) {
        Book one=new Book("Oliver Twist", 1838, "Charles Dickens");
        one.printInfo();
        Book two=new Book(2019,"Glow 15");
        two.printInfo();

    }


}
