package oop.abstraction;

public abstract class Shape{
    private String name;

    abstract void drawShape(); // Abstract methods do not have implementation/body
    abstract void calculateArea();

    void test(){ // Non-abstract method has body/implementation
        System.out.println("This is a non abstract method:");
    }

    public static void main(String[] args){
       // Shape shape = new Shape(); => abstract class cannot be instantiated- cannot make an object of abstract class.

        Shape circle = new Circle(6); // Instantiate Circle, a concrete subclass of Shape
        Shape square = new Square(9); // Instantiate Square, a concrete subclass of Shape
        Shape rectangle = new Rectangle(7.0, 8.0); // Instantiate Rectangle, a concrete subclass of Shape

        circle.drawShape(); // call overridden drawShape method in circle
        square.drawShape(); // // call overridden drawShape method in square
        rectangle.drawShape(); // call overridden drawShape method in rectangle

        System.out.println();
        System.out.println("###################");
        rectangle.calculateArea(); // call overridden calculateArea method in rectangle
        square.calculateArea(); // call overridden calculateArea method in square
        circle.calculateArea(); // call overridden calculateArea method in circle
        System.out.println();
        System.out.println("###################");
        circle.test(); // circle has achieved test() method inherited from the parent class Shape
        rectangle.test(); // rectangle has achieved test() method inherited from the parent class Shape
        square.test(); // square has achieved test() method inherited from the parent class Shape

        System.out.println();
        System.out.println("###################");
        // Type casting to call a method specific to Rectangle
        if(rectangle instanceof Rectangle){
            Rectangle rectangle1 = (Rectangle) rectangle; // This is type casting
            rectangle1.rectangleMethod();
        }

        // Type casting to call a method specific to Circle
        if(circle instanceof Circle){
            Circle circle1 = (Circle)circle;
            circle1.circleMethod();
        }

        // Type casting to call a method specific to Square
        if(square instanceof Square){
            Square square1 = (Square)square;
            square1.squareMethod();
        }


    }
}
