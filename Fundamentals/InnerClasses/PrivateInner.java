package Fundamentals.InnerClasses;

public class PrivateInner {
    /*
     * Unlike a "regular" class, an inner class can be private or protected. 
     * If you don't want outside objects to access the inner class, 
     * declare the class as private
     */

    public static void main(String[] args) {
        Outer myOuter = new Outer();
        // Outer.Inner myInner = myOuter.new Inner(); Cannot create object from private Inner class
        System.out.println("Outer Variable : " + myOuter.outerVar);
    }
}

class Outer {
    int outerVar = 10;
    Inner myInner = new Inner();
    public void outerMethod(){
        System.out.println("Outer Variable : " + outerVar + " || Inner Variable : " + myInner.innerVar);
    }
    private class Inner {
        int innerVar = 31;
        
    }
}

