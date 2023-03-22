package FileHandling.FileCreateWrite;

import java.io.File;// Import the File class
import java.io.FileWriter;
import java.io.IOException;// Import the IOException class to handle errors

 /*
  * To create a file in Java, you can use the createNewFile() method. 
  * This method returns a boolean value: true if the file was 
  * successfully created, and false if the file already exists. 
  * Note that the method is enclosed in a try...catch block. 
  * This is necessary because it throws an IOException if an 
  * error occurs (if the file cannot be created for some reason):
  */
public class Main {

        public static void main(String[] args) {
            try {
                File myObj = new File("filename.txt");
                if (myObj.createNewFile()) {
                  System.out.println("File created: " + myObj.getName());
                } else {
                  System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            
        }
}



class FileWrite {
    /*
     * In the following example, we use the FileWriter class together
     *  with its write() method to write some text to the file we created 
     * in the example above. Note that when you are done writing to the file, 
     * you should close it with the close() method:
     */
    public static void writeTo(){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}