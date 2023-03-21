package Fundamentals.Inheritance;

public class Main {
    /*
     * In Java, it is possible to inherit attributes and methods from one class to another. 
     * We group the "inheritance concept" into two categories:
     ! subclass (child) - the class that inherits from another class
     ! superclass (parent) - the class being inherited from
     * To inherit from a class, use the extends keyword.
     */

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("=========================");
        car1.seeInformation(); // This method comes from super class Vehicle
        System.out.println("=========================");
        car1.seeModelName(); // This method comes from subclass Car
    }
}
