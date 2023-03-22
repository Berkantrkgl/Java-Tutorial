package FileHandling.ReadFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    /*
     * In the previous chapter, you learned how to create and write to a file.
     * In the following example, we use the Scanner class to read the
     *  contents of the text file
     */

    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}

//To get more information about a file, use any of the File methods:
class GetFileInfo { 
    public static void main(String[] args) {
      File myObj = new File("filename.txt");
      if (myObj.exists()) {
        System.out.println("File name: " + myObj.getName());
        System.out.println("Absolute path: " + myObj.getAbsolutePath());
        System.out.println("Writeable: " + myObj.canWrite());
        System.out.println("Readable " + myObj.canRead());
        System.out.println("File size in bytes " + myObj.length());
      } else {
        System.out.println("The file does not exist.");
      }
    }
  }
