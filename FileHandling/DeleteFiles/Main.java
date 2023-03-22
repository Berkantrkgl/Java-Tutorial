package FileHandling.DeleteFiles;

import java.io.File; // Import the File class

public class Main {
    /*
     * To delete a file in Java, use the delete() method:
     */

     public static void main(String[] args) { 
        File myObj = new File("filename.txt"); 
        if (myObj.delete()) { 
          System.out.println("Deleted the file: " + myObj.getName());
        } else {
          System.out.println("Failed to delete the file.");
        } 
      }
}



//You can also delete a folder. However, it must be empty:
class DeleteFolder {
    public static void main(String[] args) { 
      File myObj = new File("C:\\Users\\MyName\\Test"); 
      if (myObj.delete()) { 
        System.out.println("Deleted the folder: " + myObj.getName());
      } else {
        System.out.println("Failed to delete the folder.");
      } 
    } 
  }
