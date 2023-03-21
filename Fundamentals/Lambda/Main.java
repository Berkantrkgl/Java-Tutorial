package Fundamentals.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    /*
     * Use a lambda expression in the 
     * ArrayList's forEach() method to print every item in the list
     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

        //Use Java's Consumer interface to store a lambda expression in a variable:
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );
    }
}
