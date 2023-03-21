package Fundamentals.Classes.OOP;

public class OopsExplanation {
    /*
     * Procedural programming is about writing procedures or methods that perform operations on the data, 
     * while object-oriented programming is about creating objects that contain both data and methods.
     */
    public static void main(String[] args) {
        /*
         * several advantages over procedural programming:
         * - OOP is faster and easier to execute
         * - OOP provides a clear structure for the programs
         * - OOP helps to keep the Java code DRY "Don't Repeat Yourself", 
         *   and makes the code easier to maintain, modify and debug
         * - OOP makes it possible to create full reusable 
         *   applications with less code and shorter development time
         */

        Car car1 = new Car("BMW", 2022, 320);
        Car car2 = new Car("Merceds", 2023, 310);

        car1.seeInformation();
        car2.seeInformation();

        System.out.println("To see cars seperate information : " + car1.getName());
        System.out.println("To see cars seperate information : " + car2.getModel());
    }
}

class Car { 
    // Here we can think of the class as a factory where cars are produced.
    public String name;
    public int model;
    public int speed;

    public Car(String name, int model, int speed) {
        this.name = name;
        this.model = model;
        this.speed = speed;
    }

    public void seeInformation(){
        System.out.println("Name of car : " + name);
        System.out.println("Model of car : " + model);
        System.out.println("Speed of car : " + speed);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getModel() {
        return model;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
}
