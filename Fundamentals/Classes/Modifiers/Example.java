package Fundamentals.Classes.Modifiers;

public class Example {
    final int x = 10;
    final double PI = 3.14;

   // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

  // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args) {
        Example obj = new Example();
        // obj.PI = 2; Here will generate error.
        System.out.println(obj.PI); 
        
        myStaticMethod();
        obj.myPublicMethod(); // Call the public method from the object.
        
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}

abstract class abstractClass{
    public String fname = "Berkan";
    public int age = 22;
    public abstract void study(); //Abstract method
}

class Student extends abstractClass{
    public int graduationYear = 2024;

    @Override
    public void study() {
       System.out.println("Studying all day long");
    }

    
}


