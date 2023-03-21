package Fundamentals.Classes.Constructor;

public class Main3 {
    int modelYear;
    String modelName;

    public Main3(int modelYear, String modelName){
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

    public static void main(String[] args) {
        Main3 obj = new Main3(2013, "BMW");
        System.out.println(obj.modelName + " " + obj.modelYear); // Output is 'BMW 2013'
    }
}
