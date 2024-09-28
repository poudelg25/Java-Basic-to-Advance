package oop.abstraction;

public class Rectangle extends Shape{
    private double length;
    private double breadth;

    public Rectangle(double l, double b){
        this.length=l;
        this.breadth=b;
    }
    @Override
    void drawShape() {
        System.out.println("Drawing rectangle shape....");
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Rectangle is: "+(length*breadth));
    }

    void rectangleMethod(){
        System.out.println("This is a non-abstract method in Rectangle class.");
    }

}
