package oop.abstraction;

public class Circle extends Shape{
    private double radius;

    public Circle(double r){
        this.radius=r;
    }

    @Override
    void drawShape() {
        System.out.println("Drawing Circle shape.....");
    }

    @Override
    void calculateArea() {
        System.out.println("Area of circle is: "+(Math.PI*radius*radius));
    }

    void circleMethod(){
        System.out.println("This is a non-abstract method in Circle class.");
    }
}
