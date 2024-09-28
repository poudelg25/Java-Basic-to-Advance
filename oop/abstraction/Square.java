package oop.abstraction;

public class Square extends Shape{
    private double length;

    public Square(double l){
        this.length=l;
    }

    @Override
    void drawShape(){
        System.out.println("Drawing square shape...");
    }

    @Override
    void calculateArea() {
        System.out.println("Area of square is: "+(length*length));
    }

    void squareMethod(){
        System.out.println("This is a non-abstract method in Square class.");
    }
}
