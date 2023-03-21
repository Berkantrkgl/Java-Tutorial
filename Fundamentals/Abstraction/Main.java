package Fundamentals.Abstraction;

/**
 * Data abstraction is the process of hiding certain details and 
 * showing only essential information to the user.
   Abstraction can be achieved with either abstract classes or interfaces
 */
public class Main {
    /*
     * The abstract keyword is a non-access modifier, used for classes and methods
     * Abstract class: is a restricted class that cannot be used to create objects
     * Abstract method: can only be used in an abstract class, 
     * and it does not have a body. The body is provided by the subclass
     */

    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}

// Abstract Class
abstract class Animal {
    // Abstract method
    public abstract void animalSound();
    //Regular method
    public void sleep() {
      System.out.println("Zzz");
    }
}


class Pig extends Animal {

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

}

