package Fundamentals.Exceptions;

/*
 *When executing Java code, different errors can occur: 
 * coding errors made by the programmer, 
 * errors due to wrong input, or other unforeseeable things. 
 */

 /*
  * When an error occurs, Java will normally stop and generate an error message. 
  * The technical term for this is: Java will throw an exception (throw an error).
  */
public class Main {
    static void checkAge(int age) {
        if (age < 18) {
        throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
        System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        /*
         * The try statement allows you to define a block of 
         * code to be tested for errors while it is being executed.
         */

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        //The throw statement allows you to create a custom error.

        /*
         * The throw statement is used together with an exception type. 
         * There are many exception types available in Java: ArithmeticException, 
         * FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc
         */

        //Exception in thread "main" java.lang.ArithmeticException: Access denied - You must be at least 18 years old.
        checkAge(12);  



    }
    
}