/**
 * Variables are containers for storing data values.
 * In Java, there are different types of variables, for example:

* String - stores text, such as "Hello". String values are surrounded by double quotes
* int - stores integers (whole numbers), without decimals, such as 123 or -123
* float - stores floating point numbers, with decimals, such as 19.99 or -19.99
* char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
* boolean - stores values with two states: true or false
 */
public class Variables {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        String name = "Berkan"; //Creating a variable in Java
        int number = 2;
        int number2;
        String name2;
        number2 = 3; //You can also declare a variable without assigning the value, and assign the value later
        name2 = "Berkan2";
        System.out.println("My number2 is " + number2 + " and My name2 is " + name2);


        final int validNumber = 30; // If you don't want the entered variable to be updated again, use the final keyword.


        
        float myFloatNum = 5.99f; //A demonstration of how to declare variables of other types:
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

    }
}

class PrintVariables {
    public static void main(String[] args) {
        

        String name = "Berkan";
        System.out.println("Hello " + name); /*The println() method is often used to display variables.
                                              * To combine both text and a variable, use the + character
                                              */
        
        String firstname = "Berkan";
        String lastName = "Turkoglu";
        String fullName = firstname + " " + lastName; // You can also use to add variables with +
        System.out.println("Full Name is : " + fullName);

    }
}

class Identifers {
    public static void main(String[] args) {
        // Name of the variables must be unique.
        // Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
        int m = 60;
        int minutePerHours = 60;
    }
}