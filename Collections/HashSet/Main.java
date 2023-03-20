package Collections.HashSet;

import java.util.HashSet;

/*
 * A HashSet is a collection of items where every item is unique, 
 * and it is found in the java.util package:
 */
public class Main {
   public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);

    //To check whether an item exists in a HashSet, use the contains() method:
    System.out.println(cars.contains("Mazda"));

    //To remove an item, use the remove() method:
    cars.remove("Volvo");

    //To remove all items, use the clear() method:
    cars.clear();

    //To find out how many items there are, use the size method:
    cars.size();

    //Loop through the items of an HashSet with a for-each loop:
    for (String i : cars) {
        System.out.println(i);
    }

    //Other Types
    HashSet<Integer> numbers = new HashSet<Integer>();
    // Add values to the set
    numbers.add(4);
    numbers.add(7);
    numbers.add(8);

    // Show which numbers between 1 and 10 are in the set
    for(int i = 1; i <= 10; i++) {
        if(numbers.contains(i)) {
          System.out.println(i + " was found in the set.");
        } else {
          System.out.println(i + " was not found in the set.");
        }
    }
   

    
   } 
}
