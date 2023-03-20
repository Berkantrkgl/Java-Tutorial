package Fundamentals.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    /*
     * Java does not have a built-in Date class, but we can import 
     * the java.time package to work with the date and time API. 
     * The package includes many date and time classes. For example:
     */

    /*
        LocalDate 	Represents a date (year, month, day (yyyy-MM-dd))
        LocalTime 	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
        LocalDateTime 	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
        DateTimeFormatter 	Formatter for displaying and parsing date-time objects
     */

    // To display the current date, import the java.time.LocalDate class, and use its now() method:

    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

        LocalTime myObj2 = LocalTime.now();
        System.out.println(myObj2);

        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println(myObj3);


        /*
         * The "T" in the example above is used to separate the date from the time. 
         * You can use the DateTimeFormatter class with the ofPattern() method in the same 
         * package to format or parse date-time objects. 
         * The following example will remove both the "T" and nanoseconds from the date-time:
         */

         DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         String formattedDate = myObj3.format(myFormatObj);
         System.out.println("After formatting: " + formattedDate);
    }
}
