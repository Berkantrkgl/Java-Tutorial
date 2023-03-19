// To use a class or a package from the library, you need to use the import keyword
import java.util.Scanner;/*In the example above, 
java.util is a package, while Scanner is a class of the java.util package. */

/*
 * A package in Java is used to group related classes. 
 * Think of it as a folder in a file directory. 
 * We use packages to avoid name conflicts, 
 * and to write a better maintainable code. Packages are divided into two categories
 ! Built-in Packages (packages from the Java API)
 ! User-defined Packages (create your own packages)
 */
public class Main {

    class BuiltInPackages {
        /*
         * The Java API is a library of prewritten classes, 
         * that are free to use, included in the Java Development Environment.
         * The library contains components for managing input, 
         * database programming, and much much more.
         */
    }

    public static void main(String[] args) {
        /*
         * To use the Scanner class, create an object of the class and use any of the 
         * available methods found in the Scanner class documentation. 
         * In our example, we will use the nextLine() method, which is used to read a complete line
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        System.out.println("Welcome " + name);


    }

    class ImportPackage {
        /*
         * To import a whole package, end the sentence with an asterisk sign (*). 
         * The following example will import ALL the classes in the java.util package
         */
        /*
         ! import java.util.*;
         */
    }
    
}