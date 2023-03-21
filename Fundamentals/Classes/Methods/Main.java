package Fundamentals.Classes.Methods;

public class Main {
    // Methods are used to perform certain actions.
    static void myMethod(){
        /*myMethod() prints a text (the action), when it is called. 
        To call a method, write the method's name followed by two parentheses () and a semicolon */
        System.out.println("Hello World !"); 
    }

    //Main method
    public static void main(String[] args) {
        myMethod();// Call the method. Output is 'Hello World!'

        staticMethod(); // Without object can accessed 

        Main obj = new Main();
        obj.publicMethod(); // Must be
    }

    /*
     * In the example above, we created a static method, 
     * which means that it can be accessed without creating an object of the class, 
     * unlike public, which can only be accessed by objects
     */

    //Static method
    static void staticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void publicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }


}
