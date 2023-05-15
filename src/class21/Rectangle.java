package class21;

public class Rectangle {

    void calculateArea(int length,int width){
        System.out.println("Area of a rectangle is "+(length*width));
    }
    void calculateArea(int side){
        System.out.println("Area of a square is "+(side*side));
    }

    public static void main(String[] args) {
        Rectangle area= new Rectangle();
       area.calculateArea(10);
        area.calculateArea(10,30);
    }
}
