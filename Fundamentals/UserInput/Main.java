package Fundamentals.UserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter username");

            String userName = myObj.nextLine();  // Read user input
            System.out.println("Username is: " + userName);  // Output user input

            // Numerical input
            int age = myObj.nextInt();
            double salary = myObj.nextDouble();
            
            // Output input by user
            System.out.println("Name: " + userName);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }
    }
}
