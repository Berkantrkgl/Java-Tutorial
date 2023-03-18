package Fundamentals.Classes.Constructor;

/**
 * A constructor in Java is a special method that is used to initialize objects. 
 * The constructor is called when an object of a class is created. 
 * It can be used to set initial values for object attributes
 */
public class Main {
    int x; // Class attribute

    public Main(){
        x = 5; // Sett the inital value for the class attribute x
    }

    public static void main(String[] args) {
        Main obj = new Main(); // Create an Object
        System.out.println(obj.x);
    }
    
}