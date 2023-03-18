package Fundamentals.Classes.Objects;

/**
 * In Java, an object is created from a class. 
 * We have already created the class named Main, so now we can use this to create objects.
 * To create an object of Main, specify the class name, 
 * followed by the object name, and use the keyword new
 */
public class Main {
    int x = 5; 

    public static void main(String[] args) {
        Main myObj = new Main();
        Main myObj2 = new Main(); // We can create multiple objects of one class.
        System.out.println(myObj.x);
        System.out.println(myObj2.x);

        /*
         * You can also create an object of a class and access it in another class. 
         * This is often used for better organization of classes (one class has all the attributes and methods, 
         * while the other class holds the main() method (code to be executed)). 
         */
        Second myObj3 = new Second(); 
        System.out.println(myObj3.x);
    }

    
}

class Second {
    int x = 7;
}