package oop.interfaceexample;

public class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing the shape of the Circle....");
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of the circle is: "+(Math.PI*radius*radius));
    }

    public void circleMethod(){
        System.out.println("This is non-abstract method inside the Circle Class.");
    }

    public static void main(String[] args){
        Shape circle = new Circle(5);
        circle.drawShape(); // Overridden drawShape method of the child class Circle.
        circle.calculateArea();// Overridden calculateArea method of the child class Circle
        circle.display(); // Calling a method(method having body) of parent class from child class using inheritance(by referencing parent class)
        System.out.println(Shape.name); // calling name field of parent class
        System.out.println(name); // calling name field of parent class

        // To call the non-abstract method of child class, first we need to perform type casting
        if (circle instanceof Circle){
            Circle circle1 = (Circle)circle;
            circle1.circleMethod();
        }

    }
}
