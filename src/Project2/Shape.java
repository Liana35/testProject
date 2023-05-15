package Project2;

import java.util.logging.SocketHandler;

public interface Shape {
    /*1. Create an Interface 'Shape' with undefined
    methods as calculateArea and
    calculatePerimiter. Create 2 classes Circle &
    Square that implements functionality defined in
    the Shape Interface. Test your code.*/
   void calculateArea();
   void calculatePerimiter();
}

class Circle implements Shape{

    double radius;
    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(3.14+radius);
    }

    @Override
    public void calculatePerimiter() {
        double perimeter= (2*3.14)*radius;
        System.out.println(perimeter);
    }
}

class Square implements Shape{

    double side;
    Square(double side){
        this.side=side;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of the square is "+side*side);
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("The perimeter of this square is "+side*4);
    }

    public static void main(String[] args) {
       Shape[] shapes={new Square(3), new Circle(5)};
       for(Shape one:shapes){
           one.calculateArea();
           one.calculatePerimiter();
       }
    }
}





