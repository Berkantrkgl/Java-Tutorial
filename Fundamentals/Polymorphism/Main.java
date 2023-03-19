package Fundamentals.Polymorphism;

public class Main {
    /*
     * Polymorphism means "many forms", 
     * and it occurs when we have many classes that are related to each other by inheritance.
     * Inheritance lets us inherit attributes and methods from another class. 
     * Polymorphism uses those methods to perform different tasks. 
     * This allows us to perform a single action in different ways.
     */
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myPig = new Animal(); // Create a Pig object
        Animal myDog = new Animal(); // Create a Dog object

        myAnimal.animalSound(); // Here we can do the same action in different ways.
        myPig.animalSound();
        myDog.animalSound();
    }
}

class Animal {
    public void animalSound(){
        System.out.println("The Animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound(){
        System.out.println("The Pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound(){
        System.out.println("The Dog says : vow vow");
    }
}

