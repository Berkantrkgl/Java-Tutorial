package Collections.ArrayList;

import java.util.ArrayList;// import the ArrayList class
import java.util.Collections;

/**
 * he ArrayList class is a resizable array, which can be found in the java.util package.
 */
public class Main {
    /*
     * The difference between a built-in array and an ArrayList in Java, 
     * is that the size of an array cannot be modified 
     * (if you want to add or remove elements to/from an array, you have to create a new one). 
     * While elements can be added and removed from an ArrayList whenever you want. 
     * The syntax is also slightly different
     */

     public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        

        System.out.println(cars.size()); //To find out how many elements an ArrayList have, use the size method

        //Loop through the elements of an ArrayList with a for loop, 
        //and use the size() method to specify how many times the loop should run
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        //You can also loop through an ArrayList with the for-each loop:
        for (String i : cars) {
            System.out.println(i);
        }

        /*
         * Another useful class in the java.util package is the Collections class, 
         * which include the sort() method for sorting lists alphabetically or numerically
         */
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
        System.out.println(i);
        }

        System.out.println(cars.get(0)); //Access an Item
        cars.set(0, "Opel"); //Change an Item
        cars.remove(0); 
        System.out.println(cars); //Remove an Item

        cars.clear(); //To remove all the elements in the ArrayList, use the clear() method:

        /*
         * Elements in an ArrayList are actually objects. 
         * In the examples above, we created elements (objects) of type "String". 
         * Remember that a String in Java is an object (not a primitive type). 
         * To use other types, such as int, you must specify an equivalent wrapper class: Integer. 
         * For other primitive types, use: Boolean for boolean, Character for char, Double for double
         */
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        for (int i : myNumbers) {
            System.out.println(i);
        }
        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
        System.out.println(i);
        }

     }

    
}