package Collections.LinkedList;

import java.util.LinkedList; // Import the LinkedList class

/**
 * The LinkedList class is almost identical to the ArrayList
 */
public class Main {
    public static void main(String[] args) {

        /*
         * The LinkedList class is a collection which can contain many 
         * objects of the same type, just like the ArrayList.
         * The LinkedList class has all of the same methods as the ArrayList 
         * class because they both implement the List interface. 
         * This means that you can add items, change items, 
         * remove items and clear the list in the same way.
         */
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        /*
         * The LinkedList stores its items in "containers." 
         * The list has a link to the first container and each container 
         * has a link to the next container in the list. To add an element to the list, 
         * the element is placed into a new container and that container is 
         * linked to one of the other containers in the list.
         */
    }
    
}