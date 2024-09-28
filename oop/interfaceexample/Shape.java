package oop.interfaceexample;

public interface Shape {
    String name="Ram"; //field must be constant in the interface

     void drawShape(); // This is similar to abstract void drawShape()
    // It does not have the keyword abstract(in interface, by default it takes abstract keyword)

     void calculateArea();

    default void display(){
        System.out.println("This is a method with body in the interface.");
    }
}
