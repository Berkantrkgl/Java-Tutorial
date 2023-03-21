package FileHandling.Files;

import java.io.File;

public class Main {
    /*
     * File handling is an important part of any application.
     * Java has several methods for creating, reading, 
     * updating, and deleting files.
     */

    public static void main(String[] args) {
        /*
         * The File class from the java.io package, allows us to work with files.
         * To use the File class, create an object of the class, 
         * and specify the filename or directory name
         */

        File myObj = new File("filename.txt"); // Specify the filename
        myObj.canRead(); // Any method
    }
}
