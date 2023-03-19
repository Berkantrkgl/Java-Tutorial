package Fundamentals.Inheritance;

public class Car extends Vehicle{
    private String modelName = "3.20"; // Car Attribute

    public void seeModelName() {
        System.out.println("Model Name : " + modelName);
    }

    @Override
    public void seeInformation() {
        System.out.println("this is a override method from Vehicle class.");
        super.seeInformation();
        System.out.println("Car Mode : " + modelName);
    }

    
}
