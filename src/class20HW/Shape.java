package class20HW;

public class Shape {

    // Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    // In circle class create a method to calculate the area of circle. Test your code


    double radius;

    Shape(double radius){
        this.radius=radius;
    }
}

class Circle extends Shape{

    Circle(double radius){
        super(radius);

    }

    void Area(){
        System.out.println("Area of the circle is "+(3.14*(radius*radius)));
    }
}





