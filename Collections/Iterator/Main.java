package Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * An Iterator is an object that can be used to loop 
 * through collections, like ArrayList and HashSet. 
 * It is called an "iterator" because "iterating" is the technical term for looping.
 * The iterator() method can be used to get an Iterator for any collection:
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
    
        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next()); 
        
        //To loop through a collection, use the hasNext() and next() methods of the Iterator:
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //Iterators are designed to easily change the collections that they loop through. 
        // The remove() method can remove items from a collection while looping.

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it2 = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it2.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);
        
    }
}
