import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthScrollBarUI;

/**
 * Dataypes
 */
public class Dataypes {
    public static void main(String[] args) {
        /*
         * Data types are divided into two groups:
         * Primitive data types - includes byte, short, int, long, float, double, boolean and char
         * Non-primitive data types - such as String, Arrays and Classes
         */
        
    }
    
}
class NonPrimitiveDataTypes {
    /*
     * Non-primitive data types are called reference types because they refer to objects.
     * Primitive types are predefined (already defined) in Java.
     * Non-primitive types are created by the programmer and is not defined by Java (except for String).
     * A primitive type has always a value, while non-primitive types can be null.
     * The size of a primitive type depends on the data type, while non-primitive types have all the same size.
     */
    
}
class BooleanTypes {
    public static void main(String[] args) {
        /*
        * For this, Java has a boolean data type, which can only take the values true or false
        */

        boolean javaisFun = true;
        boolean thisIsMe = false;
        System.out.println(javaisFun); //Output is true
        System.out.println(thisIsMe);  // Outbut is false

    }   
}
class CharacterTypes {
    public static void main(String[] args) {
        /*
         * The char data type is used to store a single character. 
         * The character must be surrounded by single quotes, like 'A' or 'c'
         */
        char myGrade = 'B';
        System.out.println(myGrade);

        //Alternatively, if you are familiar with ASCII values, you can use those to display certain characters
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
    }
}
class StringTypes {
    public static void main(String[] args) {
        /*
         * The String data type is used to store a sequence of characters (text). 
         * String values must be surrounded by double quotes
         */
        String greeting = "Hello World";
        System.out.println(greeting);
    }
}
class Numbers {
    class IntegerTypes {
        /*
         * Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. 
         * Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.
         */
        public static void main(String[] args) {
            byte myNum = 2;            //The byte data type can store whole numbers from -128 to 127.
            System.out.println(myNum);

            short myNum2 = 5000;      //The short data type can store whole numbers from -32768 to 32767.
            System.out.println(myNum2);

            int myNum3 = 100000;         //The int data type can store whole numbers from -2147483648 to 2147483647.   
            System.out.println(myNum3);  //int data type is the preferred data type

            long myNum4 = 15000000000L;  //The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
            System.out.println(myNum4);  // This is used when int is not large enough to store the value.

        }
    }
    class FloatingPointTypes {
        public static void main(String[] args) {
            /*
             * You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
             * The float and double data types can store fractional numbers. 
             * Note that you should end the value with an "f" for floats and "d" for doubles
             */

            float numb = 5.75f; 
            System.out.println(numb);

            double numb2 = 19.99d;  
            System.out.println(numb2);

            /*
             * A floating point number can also be a scientific number with an "e" to indicate the power of 10:
             */

            float f1 = 35e3f;
            double d1 = 12E4d;
            System.out.println(f1);
            System.out.println(d1);
        }
    }
}