package Fundamentals.Classes.Modifiers;

public class Main {
    /*
     * The public keyword is an access modifier, 
     * meaning that it is used to set the access level for classes, 
     * attributes, methods and constructors.
     * We divide modifiers into two groups
     ! Access Modifiers 
     ! Non-Access Modifiers
     */

    class Calasses{
        /*
         * For Classes, you can use either public or default.
         ! public : The class is accessible by any other class
         ! default 	The class is only accessible by classes in the same package. 
         ! This is used when you don't specify a modifier. 
         */
    }

    class Attributes {
        /*
         * For attributes, methods and constructors, 
         * you can use the one of the following:
         ! public :	The code is accessible for all classes
         ! private :The code is only accessible within the declared class
         ! default :The code is only accessible in the same package. 
         ! This is used when you don't specify a modifier.
         ! protected :	The code is accessible in the same package and subclasses.
         */
    }
    class NonAccesModifier {
        /*
         * For classes, you can use either final or abstract
         ! final 	The class cannot be inherited by other classes
         ! abstract 	The class cannot be used to create objects
         */
    
        /*
         * For attributes and methods, you can use the one of the following:
         ! final 	Attributes and methods cannot be overridden/modified
         ! static 	Attributes and methods belongs to the class, rather than an object
         ! abstract 	Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. 
         !The body is provided by the subclass (inherited from).
         ! transient 	Attributes and methods are skipped when serializing the object containing them
         ! synchronized 	Methods can only be accessed by one thread at a time
         ! volatile 	The value of an attribute is not cached thread-locally, and is always read from the "main memory"
         */
    
    }
    
}

