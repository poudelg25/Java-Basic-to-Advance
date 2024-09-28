package oop.polymorphism;

public class MethodOverRiding {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.makesSound(); //Overridden method in Dog
        dog.run(); // Method specific to Dog
        dog.eat(); // Inherited method from Animal

        Animal dog2 = new Dog(); // Polymorphic behavior - creating a dog2 object by referencing Animal, so we can override a method
        dog2.makesSound(); // Overridden method in dog
        dog2.eat(); // Inherited method from Animal

        // dog2.run(); this line would cause to a compile-time error
        // To sort out this problem, we have to caste to call child specific method
        if(dog2 instanceof Dog){
        Dog dogRef = (Dog)dog2;
        dogRef.run(); // This will print: Dog can run fast
        }


       Animal animal = new Animal();
       animal.eat(); // Method in Animal
       animal.makesSound(); // Method in Animal
    }
}
 class Animal{

    public void makesSound(){
        System.out.println("Animal makes sound!!");
    }

    public void eat(){
        System.out.println("Animal eats food!!");
    }
 }

 class Dog extends Animal{
    @Override
    public void makesSound(){
        System.out.println("Dog barks!!!");
    }

    public void run(){
        System.out.println("Dog can run fast!!");
    }
 }
