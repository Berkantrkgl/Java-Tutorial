package Collections.HashMap;

import java.util.HashMap;// import the HashMap class

/*
 * In the ArrayList chapter, you learned that Arrays store items as an ordered collection, 
 * and you have to access them with an index number (int type). A HashMap however, 
 * store items in "key/value" pairs, 
 * and you can access them by an index of another type (e.g. a String).
 */
public class Main {
    /*
     * One object is used as a key (index) to another object (value). It can store different types: 
     * String keys and Integer values, or the same type, like: String keys and String values:
     */
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        //To access a value in the HashMap, use the get() method and refer to its key:
        capitalCities.get("England");

        //To remove an item, use the remove() method and refer to the key:
        capitalCities.remove("England");

        //To remove all items, use the clear() method:
        capitalCities.clear();

        //To find out how many items there are, use the size() method:
        capitalCities.size();

        //Loop through the items of a HashMap with a for-each loop.
        //Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
        System.out.println("key: " + i + " value: " + people.get(i));
        }
  
    }
}
